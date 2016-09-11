package im.jianyu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import im.jianyu.util.ColorCodes;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

/**
 * Hello world!
 */
public class Checker {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd 'at' HH:mm:ss.SSS");

    private static String[] wishStore = new String[] {
        "R484", // 深圳益田假日广场
        "R577"  // 广州天环广场
    };

    private static String[] wishProduct = new String[] {
//            "MNH12CH/A",
            // iPhone 7 Plus 128G all color
            "MNFU2CH/A", // 亮黑
            "MNFP2CH/A", // 黑
            "MNFR2CH/A", // 金
            "MNFT2CH/A", // 玫瑰金
            "MNFQ2CH/A"  // 银
    };

    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = new HttpClient();
        // 设置代理服务器地址和端口
        // client.getHostConfiguration().setProxy("proxy_host_addr",proxy_port);
        // 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https
        HttpMethod availabilityGet = new GetMethod("https://reserve.cdn-apple.com/CN/zh_CN/reserve/iPhone/availability.json");
        availabilityGet.setRequestHeader("Pragma", "no-cache");
        availabilityGet.setRequestHeader("Accept", "application/json, text/javascript, */*; q=0.01");
        availabilityGet.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8");
        availabilityGet.setRequestHeader("Referer", "https://reserve.cdn-apple.com/CN/zh_CN/reserve/iPhone/availability?channel=1");
        availabilityGet.setRequestHeader("Cache-Control", "no-cache");
        availabilityGet.setRequestHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");
        availabilityGet.setRequestHeader("X-Requested-With", "XMLHttpRequest");
        // 使用POST方法
        // HttpMethod availabilityGet = new PostMethod("http://java.sun.com");
        String serverChanUrl = "http://sc.ftqq.com/SCU54T81b14e895e41da38f5bfae3efd22b8ec55eee4eba0829.send";
        PostMethod postServerChan = new PostMethod(serverChanUrl);
        postServerChan.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

        while (true) {
            client.executeMethod(availabilityGet);

            // 打印服务器返回的状态
            // System.out.println(availabilityGet.getStatusLine());
            String json = availabilityGet.getResponseBodyAsString();
            // 打印返回的信息
            // System.out.println(json);


            // 处理Json字符串结果
            JSONObject jsonObject = JSON.parseObject(json);

            LocalDateTime updatedTime = null;

            // key到值中，R开头的是零售店的代号；此外，还有一个字段是updated表示更新时间
            for (String key : jsonObject.keySet()) {
                if (Arrays.stream(wishStore).anyMatch(storeName -> storeName.equals(key))) {
                    JSONObject retailStoreProducts = jsonObject.getJSONObject(key);
                    // 打印零售店名字
                    System.out.println("\n" + CNStoreExtrator.getFullStoreName(key));

                    // 查找有货
                    for (String modalCode : retailStoreProducts.keySet()) {
                        String phoneName = iPhone7ModalExtrator.getProductDesc(modalCode);
                        if (phoneName != null && retailStoreProducts.getString(modalCode).equals("ALL")) {

                            // 匹配查找心愿iPhone
                            if (Arrays.stream(wishProduct).anyMatch(partNumber -> partNumber.equals(modalCode))) {
                                System.out.println(ColorCodes.RED_FG + "##" + phoneName + "##  有货" + ColorCodes.RESET);
                                // 发送提醒到Server酱
                                executorService.submit(() -> {
                                    HttpClient postClient = new HttpClient();

                                    NameValuePair[] data = {
                                        new NameValuePair("text", phoneName.replaceAll(" ", "__")),
                                        new NameValuePair("desp", "要你破费了0_0")
                                    };
                                    postServerChan.setRequestBody(data);
                                    try {
//                                        postClient.executeMethod(postServerChan);
                                        client.executeMethod(postServerChan);
                                    } catch (IOException ignored) {
                                    }
                                    postServerChan.releaseConnection();
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
                System.out.println("Server最后更新时间： Missing" );
            } else {
                System.out.println("Server最后更新时间：" + updatedTime.format(formatter));
            }
            System.out.println("最后更新时间：" + LocalDateTime.now(ZoneOffset.of("+8")).format(formatter));

            //TODO sleep逻辑可以根据更新时间和热点时间调整
            sleep(3000);
        }
        // 释放连接
        // availabilityGet.releaseConnection();
    }

}
