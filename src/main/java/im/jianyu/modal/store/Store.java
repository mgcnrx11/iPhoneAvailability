
package im.jianyu.modal.store;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "storeNumber",
    "storeName",
    "storeEnabled",
    "sellEdition",
    "storeCity"
})
public class Store {

    @JsonProperty("storeNumber")
    private String storeNumber;
    @JsonProperty("storeName")
    private String storeName;
    @JsonProperty("storeEnabled")
    private Boolean storeEnabled;
    @JsonProperty("sellEdition")
    private Boolean sellEdition;
    @JsonProperty("storeCity")
    private String storeCity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The storeNumber
     */
    @JsonProperty("storeNumber")
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * 
     * @param storeNumber
     *     The storeNumber
     */
    @JsonProperty("storeNumber")
    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    /**
     * 
     * @return
     *     The storeName
     */
    @JsonProperty("storeName")
    public String getStoreName() {
        return storeName;
    }

    /**
     * 
     * @param storeName
     *     The storeName
     */
    @JsonProperty("storeName")
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * 
     * @return
     *     The storeEnabled
     */
    @JsonProperty("storeEnabled")
    public Boolean getStoreEnabled() {
        return storeEnabled;
    }

    /**
     * 
     * @param storeEnabled
     *     The storeEnabled
     */
    @JsonProperty("storeEnabled")
    public void setStoreEnabled(Boolean storeEnabled) {
        this.storeEnabled = storeEnabled;
    }

    /**
     * 
     * @return
     *     The sellEdition
     */
    @JsonProperty("sellEdition")
    public Boolean getSellEdition() {
        return sellEdition;
    }

    /**
     * 
     * @param sellEdition
     *     The sellEdition
     */
    @JsonProperty("sellEdition")
    public void setSellEdition(Boolean sellEdition) {
        this.sellEdition = sellEdition;
    }

    /**
     * 
     * @return
     *     The storeCity
     */
    @JsonProperty("storeCity")
    public String getStoreCity() {
        return storeCity;
    }

    /**
     * 
     * @param storeCity
     *     The storeCity
     */
    @JsonProperty("storeCity")
    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
