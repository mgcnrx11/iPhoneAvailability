package im.jianyu.model.store;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Store {

    private String storeNumber;
    private String storeName;
    private Boolean storeEnabled;
    private Boolean sellEdition;
    private String storeCity;

    /**
     *
     * @return
     *     The storeNumber
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     *
     * @param storeNumber
     *     The storeNumber
     */
    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    /**
     *
     * @return
     *     The storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     *
     * @param storeName
     *     The storeName
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     *
     * @return
     *     The storeEnabled
     */
    public Boolean getStoreEnabled() {
        return storeEnabled;
    }

    /**
     *
     * @param storeEnabled
     *     The storeEnabled
     */
    public void setStoreEnabled(Boolean storeEnabled) {
        this.storeEnabled = storeEnabled;
    }

    /**
     *
     * @return
     *     The sellEdition
     */
    public Boolean getSellEdition() {
        return sellEdition;
    }

    /**
     *
     * @param sellEdition
     *     The sellEdition
     */
    public void setSellEdition(Boolean sellEdition) {
        this.sellEdition = sellEdition;
    }

    /**
     *
     * @return
     *     The storeCity
     */
    public String getStoreCity() {
        return storeCity;
    }

    /**
     *
     * @param storeCity
     *     The storeCity
     */
    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

}
