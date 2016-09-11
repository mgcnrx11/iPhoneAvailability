package im.jianyu;

import com.fasterxml.jackson.databind.ObjectMapper;
import im.jianyu.modal.store.CNStore;
import im.jianyu.modal.store.Store;

import java.io.IOException;
import java.util.Optional;

/**
 * 截止到2016-09-10的在中国CN开设零售店列表
 *
 * @author YuJian
 * @version 16/9/10
 */
public class CNStoreExtrator {

    private final static String storeJson = "{\"updatedTime\":\"下午 3:45\",\"supportedDomains\":{\"0\":\"https://apple.com/cn/iphone-7/\",\"1\":\"http://www.apple.com/\",\"2\":\"http://storeint.apple.com/\",\"3\":\"http://epp.apple.com/\",\"4\":\"applestore://\"},\"stores\":[{\"storeNumber\":\"R320\",\"storeName\":\"三里屯\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"北京\"},{\"storeNumber\":\"R401\",\"storeName\":\"上海环贸 iapm\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"上海\"},{\"storeNumber\":\"R534\",\"storeName\":\"中街大悦城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"沈阳\"},{\"storeNumber\":\"R581\",\"storeName\":\"五角场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"上海\"},{\"storeNumber\":\"R479\",\"storeName\":\"华贸购物中心\",\"storeEnabled\":true,\"sellEdition\":true,\"storeCity\":\"北京\"},{\"storeNumber\":\"R359\",\"storeName\":\"南京东路\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"上海\"},{\"storeNumber\":\"R493\",\"storeName\":\"南京艾尚天地\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"南京\"},{\"storeNumber\":\"R571\",\"storeName\":\"南宁万象城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"南宁\"},{\"storeNumber\":\"R644\",\"storeName\":\"厦门新生活广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"厦门\"},{\"storeNumber\":\"R609\",\"storeName\":\"大连恒隆广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"大连\"},{\"storeNumber\":\"R637\",\"storeName\":\"天津大悦城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"天津\"},{\"storeNumber\":\"R579\",\"storeName\":\"天津恒隆广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"天津\"},{\"storeNumber\":\"R577\",\"storeName\":\"天环广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"广州\"},{\"storeNumber\":\"R502\",\"storeName\":\"成都万象城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"成都\"},{\"storeNumber\":\"R580\",\"storeName\":\"成都太古里\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"成都\"},{\"storeNumber\":\"R574\",\"storeName\":\"无锡恒隆广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"无锡\"},{\"storeNumber\":\"R645\",\"storeName\":\"朝阳大悦城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"北京\"},{\"storeNumber\":\"R532\",\"storeName\":\"杭州万象城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"杭州\"},{\"storeNumber\":\"R576\",\"storeName\":\"沈阳万象城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"沈阳\"},{\"storeNumber\":\"R646\",\"storeName\":\"泰禾广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"福州\"},{\"storeNumber\":\"R648\",\"storeName\":\"济南恒隆广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"济南\"},{\"storeNumber\":\"R389\",\"storeName\":\"浦东\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"上海\"},{\"storeNumber\":\"R484\",\"storeName\":\"深圳益田假日广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"深圳\"},{\"storeNumber\":\"R448\",\"storeName\":\"王府井\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"北京\"},{\"storeNumber\":\"R683\",\"storeName\":\"环球港\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"上海\"},{\"storeNumber\":\"R478\",\"storeName\":\"百年城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"大连\"},{\"storeNumber\":\"R643\",\"storeName\":\"虹悦城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"南京\"},{\"storeNumber\":\"R388\",\"storeName\":\"西单大悦城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"北京\"},{\"storeNumber\":\"R471\",\"storeName\":\"西湖\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"杭州\"},{\"storeNumber\":\"R480\",\"storeName\":\"解放碑\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"重庆\"},{\"storeNumber\":\"R572\",\"storeName\":\"郑州万象城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"郑州\"},{\"storeNumber\":\"R573\",\"storeName\":\"重庆万象城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"重庆\"},{\"storeNumber\":\"R476\",\"storeName\":\"重庆北城天街\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"重庆\"},{\"storeNumber\":\"R638\",\"storeName\":\"银河国际购物中心\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"天津\"},{\"storeNumber\":\"R557\",\"storeName\":\"青岛万象城\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"青岛\"},{\"storeNumber\":\"R390\",\"storeName\":\"香港广场\",\"storeEnabled\":true,\"sellEdition\":false,\"storeCity\":\"上海\"}],\"timezone\":\"CST\",\"updatedDate\":\"9月10日星期六\",\"reservationURL\":\"https://reserve-cn.apple.com/CN/zh_CN/reserve/iPhone\"}";

    private static CNStore cnStore;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            cnStore = mapper.readValue(storeJson, CNStore.class);
        } catch (IOException ignored) {
        }
    }

    /**
     * FullStoreName即组合城市与零售店名。
     * @param storeNumber 零售店代号
     * @return 城市与零售店名组合名
     */
    public static String getFullStoreName(final String storeNumber) {
        Optional<Store> storeFound = cnStore.getStores()
                .stream()
                .filter(store -> store.getStoreNumber().equals(storeNumber))
                .findAny();

        if (storeFound.isPresent()) {
            return storeFound.get().getStoreCity() + " " + storeFound.get().getStoreName();
        } else {
            return "No Such Store";
        }
    }
}
