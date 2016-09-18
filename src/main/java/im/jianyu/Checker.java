package im.jianyu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import im.jianyu.extractor.CNStoreExtractor;
import im.jianyu.extractor.iPhone7ModalExtractor;
import im.jianyu.handler.ServerChanResponseHandler;
import im.jianyu.util.ColorCodes;
import org.apache.http.NameValuePair;
import org.apache.http.client.fluent.Request;
import org.apache.http.message.BasicNameValuePair;

import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

/**
 * Hello world!
 */
public class Checker {

    private static final String CHECK_MARK = "\u2713";
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd 'at' HH:mm:ss.SSS");
    private static String[] wishStores = new String[]{
//        "R484", // 深圳益田假日广场
        "R577"  // 广州天环广场
    };

    private static String[] wishProducts = new String[]{
//        "MNH12CH/A", // iPhone 7 128GB 玫瑰金色
        // iPhone 7 Plus 128G all color
        "MNFU2CH/A", // 亮黑
        "MNFP2CH/A", // 黑
//        "MNFR2CH/A", // 金
//        "MNFT2CH/A", // 玫瑰金
//        "MNFQ2CH/A"  // 银
    };

    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    private static ServerChanResponseHandler serverChanHandler = new ServerChanResponseHandler();

    private static ConcurrentHashMap<String, Long> serverChanSentTimestampMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException, InterruptedException {

        Request availabilityGet = Request.Get("https://reserve.cdn-apple.com/CN/zh_CN/reserve/iPhone/availability.json")
            .setHeader("Pragma", "no-cache")
            .setHeader("Accept", "application/json, text/javascript, */*; q=0.01")
            .setHeader("Accept-Language", "zh-CN,zh;q=0.8")
            .setHeader("Referer", "https://reserve.cdn-apple.com/CN/zh_CN/reserve/iPhone/availability?channel=1")
            .setHeader("Cache-Control", "no-cache")
            .setHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36")
            .setHeader("X-Requested-With", "XMLHttpRequest");


        Request postServerChan = Request.Post("http://sc.ftqq.com/SCU54T81b14e895e41da38f5bfae3efd22b8ec55eee4eba0829.send")
            .setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

        while (true) {
            String json;
            try {
                json = availabilityGet.execute().returnContent().asString(StandardCharsets.UTF_8);
                // System.out.println(json);
            } catch (UnknownHostException | SSLHandshakeException e) {
                System.err.println(e.getLocalizedMessage());
                continue;
            }

            // 处理Json字符串结果
            JSONObject jsonObject = JSON.parseObject(json);

            LocalDateTime updatedTime = null;

            // key到值中，R开头的是零售店的代号；此外，还有一个字段是updated表示更新时间
            for (String key : jsonObject.keySet()) {
                if (Arrays.stream(wishStores).anyMatch(storeName -> storeName.equals(key))) {
                    JSONObject retailStoreProducts = jsonObject.getJSONObject(key);
                    // 打印零售店名字
                    System.out.println("\n" + CNStoreExtractor.getFullStoreName(key));

                    // 查找有货
                    for (String partNumber : retailStoreProducts.keySet()) {
                        String phoneName = iPhone7ModalExtractor.getProductDesc(partNumber);
                        if ("No Such Product".equals(phoneName)) {
                            // timeSlot
                            continue;
                        }
                        if (phoneName != null && retailStoreProducts.getString(partNumber).equals("ALL")) {

                            // 匹配查找心愿iPhone
                            if (Arrays.stream(wishProducts).anyMatch(wishPartNumber -> wishPartNumber.equals(partNumber))) {
                                System.out.println(ColorCodes.RED + CHECK_MARK + phoneName + " 有货" + ColorCodes.RESET);
                                // 发送提醒到Server酱
                                executorService.submit(() -> {
                                    // 首先判断是否在Calm Down
                                    Long lastPostTimestamp = serverChanSentTimestampMap.get(String.join(key, partNumber));
                                    if (lastPostTimestamp != null && System.currentTimeMillis() - lastPostTimestamp <= 300 * 1000) {
                                        // Server酱：CD要5分钟
                                        return;
                                    }

                                    NameValuePair[] data = {
                                        new BasicNameValuePair("text", phoneName.replaceAll(" ", "_")),
                                        new BasicNameValuePair("desp", CNStoreExtractor.getFullStoreName(key))
                                    };
                                    try {
                                        JSONObject result = postServerChan
                                            .bodyForm(Arrays.asList(data), StandardCharsets.UTF_8)
                                            .execute()
                                            .handleResponse(serverChanHandler);

                                        serverChanSentTimestampMap.put(String.join(key, partNumber), System.currentTimeMillis());

                                        // 判断是否需要Calm Down
                                        if (result.getIntValue("errno") == 1024) {
                                            // really can't run to here
                                            System.err.println(String.join(key, partNumber) + result.getString("errmsg"));
                                        }
                                    } catch (IOException ignored) {
                                    }

                                });

                            } else {
                                System.out.println(phoneName + "  有货");
                            }
                        }

                    }
                } else if (key.equals("updated")) {
                    // 最后更新日期
                    updatedTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(jsonObject.getLongValue(key)),
                        ZoneOffset.of("+8"));
                }
            }

            // 若availability.json没有updated字段
            if (updatedTime == null) {
                System.out.println("AppleServer最后更新时间： Missing");
            } else {
                System.out.println("AppleServer最后更新时间：" + updatedTime.format(formatter));
            }
            System.out.println("Checker最后更新时间：" + LocalDateTime.now(ZoneOffset.of("+8")).format(formatter));

            //TODO sleep逻辑可以根据更新时间和热点时间调整
            sleep(3000);
        }

    }

}
