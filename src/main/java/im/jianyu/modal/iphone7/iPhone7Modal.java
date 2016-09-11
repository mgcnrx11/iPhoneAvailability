
package im.jianyu.modal.iphone7;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "skus"
})
public class iPhone7Modal {

    @JsonProperty("skus")
    private List<Sku> skus = new ArrayList<Sku>();

    /**
     * 
     * @return
     *     The skus
     */
    @JsonProperty("skus")
    public List<Sku> getSkus() {
        return skus;
    }

    /**
     * 
     * @param skus
     *     The skus
     */
    @JsonProperty("skus")
    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

}
