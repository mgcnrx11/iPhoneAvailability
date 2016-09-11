
package im.jianyu.modal.iphone7;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "part_number",
    "productDescription",
    "capacity",
    "productDisplayPrice",
    "discount_price",
    "colorSortOrder",
    "installmentPrice",
    "installmentPeriod",
    "color",
    "ipp_price",
    "ipp_installments",
    "color_swatch_url",
    "color_swatch_retina_url",
    "colorSwatch3xUrl",
    "productImageURL",
    "productImageURL2x",
    "productImage3xUrl",
    "contractEnabled",
    "unlockEnabled",
    "group_id",
    "subfamily_id"
})
public class Sku {

    @JsonProperty("part_number")
    private String partNumber;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("capacity")
    private String capacity;
    @JsonProperty("productDisplayPrice")
    private String productDisplayPrice;
    @JsonProperty("discount_price")
    private String discountPrice;
    @JsonProperty("colorSortOrder")
    private String colorSortOrder;
    @JsonProperty("installmentPrice")
    private String installmentPrice;
    @JsonProperty("installmentPeriod")
    private String installmentPeriod;
    @JsonProperty("color")
    private String color;
    @JsonProperty("ipp_price")
    private String ippPrice;
    @JsonProperty("ipp_installments")
    private String ippInstallments;
    @JsonProperty("color_swatch_url")
    private String colorSwatchUrl;
    @JsonProperty("color_swatch_retina_url")
    private String colorSwatchRetinaUrl;
    @JsonProperty("colorSwatch3xUrl")
    private String colorSwatch3xUrl;
    @JsonProperty("productImageURL")
    private String productImageURL;
    @JsonProperty("productImageURL2x")
    private String productImageURL2x;
    @JsonProperty("productImage3xUrl")
    private String productImage3xUrl;
    @JsonProperty("contractEnabled")
    private Boolean contractEnabled;
    @JsonProperty("unlockEnabled")
    private Boolean unlockEnabled;
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("subfamily_id")
    private String subfamilyId;

    /**
     * 
     * @return
     *     The partNumber
     */
    @JsonProperty("part_number")
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * 
     * @param partNumber
     *     The part_number
     */
    @JsonProperty("part_number")
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * 
     * @return
     *     The productDescription
     */
    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * 
     * @param productDescription
     *     The productDescription
     */
    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * 
     * @return
     *     The capacity
     */
    @JsonProperty("capacity")
    public String getCapacity() {
        return capacity;
    }

    /**
     * 
     * @param capacity
     *     The capacity
     */
    @JsonProperty("capacity")
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * 
     * @return
     *     The productDisplayPrice
     */
    @JsonProperty("productDisplayPrice")
    public String getProductDisplayPrice() {
        return productDisplayPrice;
    }

    /**
     * 
     * @param productDisplayPrice
     *     The productDisplayPrice
     */
    @JsonProperty("productDisplayPrice")
    public void setProductDisplayPrice(String productDisplayPrice) {
        this.productDisplayPrice = productDisplayPrice;
    }

    /**
     * 
     * @return
     *     The discountPrice
     */
    @JsonProperty("discount_price")
    public String getDiscountPrice() {
        return discountPrice;
    }

    /**
     * 
     * @param discountPrice
     *     The discount_price
     */
    @JsonProperty("discount_price")
    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * 
     * @return
     *     The colorSortOrder
     */
    @JsonProperty("colorSortOrder")
    public String getColorSortOrder() {
        return colorSortOrder;
    }

    /**
     * 
     * @param colorSortOrder
     *     The colorSortOrder
     */
    @JsonProperty("colorSortOrder")
    public void setColorSortOrder(String colorSortOrder) {
        this.colorSortOrder = colorSortOrder;
    }

    /**
     * 
     * @return
     *     The installmentPrice
     */
    @JsonProperty("installmentPrice")
    public String getInstallmentPrice() {
        return installmentPrice;
    }

    /**
     * 
     * @param installmentPrice
     *     The installmentPrice
     */
    @JsonProperty("installmentPrice")
    public void setInstallmentPrice(String installmentPrice) {
        this.installmentPrice = installmentPrice;
    }

    /**
     * 
     * @return
     *     The installmentPeriod
     */
    @JsonProperty("installmentPeriod")
    public String getInstallmentPeriod() {
        return installmentPeriod;
    }

    /**
     * 
     * @param installmentPeriod
     *     The installmentPeriod
     */
    @JsonProperty("installmentPeriod")
    public void setInstallmentPeriod(String installmentPeriod) {
        this.installmentPeriod = installmentPeriod;
    }

    /**
     * 
     * @return
     *     The color
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The ippPrice
     */
    @JsonProperty("ipp_price")
    public String getIppPrice() {
        return ippPrice;
    }

    /**
     * 
     * @param ippPrice
     *     The ipp_price
     */
    @JsonProperty("ipp_price")
    public void setIppPrice(String ippPrice) {
        this.ippPrice = ippPrice;
    }

    /**
     * 
     * @return
     *     The ippInstallments
     */
    @JsonProperty("ipp_installments")
    public String getIppInstallments() {
        return ippInstallments;
    }

    /**
     * 
     * @param ippInstallments
     *     The ipp_installments
     */
    @JsonProperty("ipp_installments")
    public void setIppInstallments(String ippInstallments) {
        this.ippInstallments = ippInstallments;
    }

    /**
     * 
     * @return
     *     The colorSwatchUrl
     */
    @JsonProperty("color_swatch_url")
    public String getColorSwatchUrl() {
        return colorSwatchUrl;
    }

    /**
     * 
     * @param colorSwatchUrl
     *     The color_swatch_url
     */
    @JsonProperty("color_swatch_url")
    public void setColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl;
    }

    /**
     * 
     * @return
     *     The colorSwatchRetinaUrl
     */
    @JsonProperty("color_swatch_retina_url")
    public String getColorSwatchRetinaUrl() {
        return colorSwatchRetinaUrl;
    }

    /**
     * 
     * @param colorSwatchRetinaUrl
     *     The color_swatch_retina_url
     */
    @JsonProperty("color_swatch_retina_url")
    public void setColorSwatchRetinaUrl(String colorSwatchRetinaUrl) {
        this.colorSwatchRetinaUrl = colorSwatchRetinaUrl;
    }

    /**
     * 
     * @return
     *     The colorSwatch3xUrl
     */
    @JsonProperty("colorSwatch3xUrl")
    public String getColorSwatch3xUrl() {
        return colorSwatch3xUrl;
    }

    /**
     * 
     * @param colorSwatch3xUrl
     *     The colorSwatch3xUrl
     */
    @JsonProperty("colorSwatch3xUrl")
    public void setColorSwatch3xUrl(String colorSwatch3xUrl) {
        this.colorSwatch3xUrl = colorSwatch3xUrl;
    }

    /**
     * 
     * @return
     *     The productImageURL
     */
    @JsonProperty("productImageURL")
    public String getProductImageURL() {
        return productImageURL;
    }

    /**
     * 
     * @param productImageURL
     *     The productImageURL
     */
    @JsonProperty("productImageURL")
    public void setProductImageURL(String productImageURL) {
        this.productImageURL = productImageURL;
    }

    /**
     * 
     * @return
     *     The productImageURL2x
     */
    @JsonProperty("productImageURL2x")
    public String getProductImageURL2x() {
        return productImageURL2x;
    }

    /**
     * 
     * @param productImageURL2x
     *     The productImageURL2x
     */
    @JsonProperty("productImageURL2x")
    public void setProductImageURL2x(String productImageURL2x) {
        this.productImageURL2x = productImageURL2x;
    }

    /**
     * 
     * @return
     *     The productImage3xUrl
     */
    @JsonProperty("productImage3xUrl")
    public String getProductImage3xUrl() {
        return productImage3xUrl;
    }

    /**
     * 
     * @param productImage3xUrl
     *     The productImage3xUrl
     */
    @JsonProperty("productImage3xUrl")
    public void setProductImage3xUrl(String productImage3xUrl) {
        this.productImage3xUrl = productImage3xUrl;
    }

    /**
     * 
     * @return
     *     The contractEnabled
     */
    @JsonProperty("contractEnabled")
    public Boolean getContractEnabled() {
        return contractEnabled;
    }

    /**
     * 
     * @param contractEnabled
     *     The contractEnabled
     */
    @JsonProperty("contractEnabled")
    public void setContractEnabled(Boolean contractEnabled) {
        this.contractEnabled = contractEnabled;
    }

    /**
     * 
     * @return
     *     The unlockEnabled
     */
    @JsonProperty("unlockEnabled")
    public Boolean getUnlockEnabled() {
        return unlockEnabled;
    }

    /**
     * 
     * @param unlockEnabled
     *     The unlockEnabled
     */
    @JsonProperty("unlockEnabled")
    public void setUnlockEnabled(Boolean unlockEnabled) {
        this.unlockEnabled = unlockEnabled;
    }

    /**
     * 
     * @return
     *     The groupId
     */
    @JsonProperty("group_id")
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId
     *     The group_id
     */
    @JsonProperty("group_id")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 
     * @return
     *     The subfamilyId
     */
    @JsonProperty("subfamily_id")
    public String getSubfamilyId() {
        return subfamilyId;
    }

    /**
     * 
     * @param subfamilyId
     *     The subfamily_id
     */
    @JsonProperty("subfamily_id")
    public void setSubfamilyId(String subfamilyId) {
        this.subfamilyId = subfamilyId;
    }

}
