package im.jianyu.model.store;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class CNStore {

    private String updatedTime;
    private List<Store> stores = new ArrayList<Store>();
    private String timezone;
    private String updatedDate;
    private String reservationURL;

    /**
     *
     * @return
     *     The updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     *
     * @param updatedTime
     *     The updatedTime
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     *
     * @return
     *     The stores
     */
    public List<Store> getStores() {
        return stores;
    }

    /**
     *
     * @param stores
     *     The stores
     */
    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    /**
     *
     * @return
     *     The timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     *
     * @param timezone
     *     The timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     *
     * @return
     *     The updatedDate
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     *
     * @param updatedDate
     *     The updatedDate
     */
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     *
     * @return
     *     The reservationURL
     */
    public String getReservationURL() {
        return reservationURL;
    }

    /**
     *
     * @param reservationURL
     *     The reservationURL
     */
    public void setReservationURL(String reservationURL) {
        this.reservationURL = reservationURL;
    }

}
