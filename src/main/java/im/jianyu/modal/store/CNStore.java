package im.jianyu.modal.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        "updatedTime",
        "stores",
        "timezone",
        "updatedDate",
        "reservationURL"
})
public class CNStore {

    @JsonProperty("updatedTime")
    private String updatedTime;
    @JsonProperty("stores")
    private List<Store> stores = new ArrayList<Store>();
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("updatedDate")
    private String updatedDate;
    @JsonProperty("reservationURL")
    private String reservationURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The updatedTime
     */
    @JsonProperty("updatedTime")
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     *
     * @param updatedTime
     * The updatedTime
     */
    @JsonProperty("updatedTime")
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     *
     * @return
     * The stores
     */
    @JsonProperty("stores")
    public List<Store> getStores() {
        return stores;
    }

    /**
     *
     * @param stores
     * The stores
     */
    @JsonProperty("stores")
    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    /**
     *
     * @return
     * The timezone
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     *
     * @param timezone
     * The timezone
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     *
     * @return
     * The updatedDate
     */
    @JsonProperty("updatedDate")
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     *
     * @param updatedDate
     * The updatedDate
     */
    @JsonProperty("updatedDate")
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     *
     * @return
     * The reservationURL
     */
    @JsonProperty("reservationURL")
    public String getReservationURL() {
        return reservationURL;
    }

    /**
     *
     * @param reservationURL
     * The reservationURL
     */
    @JsonProperty("reservationURL")
    public void setReservationURL(String reservationURL) {
        this.reservationURL = reservationURL;
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