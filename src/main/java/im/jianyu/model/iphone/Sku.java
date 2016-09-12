package im.jianyu.model.iphone;

import com.alibaba.fastjson.annotation.JSONField;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Sku {
    @JSONField(name = "part_number")
    private String partNumber;
    private String productDescription;
    private String capacity;
    private String productDisplayPrice;
    @JSONField(name = "discount_price")
    private String discountPrice;
    private String colorSortOrder;
    private String installmentPrice;
    private String installmentPeriod;
    private String color;
    @JSONField(name = "ipp_price")
    private String ippPrice;
    @JSONField(name = "ipp_installments")
    private String ippInstallments;
    @JSONField(name = "color_swatch_url")
    private String colorSwatchUrl;
    @JSONField(name = "color_swatch_retina_url")
    private String colorSwatchRetinaUrl;
    private String colorSwatch3xUrl;
    private String productImageURL;
    private String productImageURL2x;
    private String productImage3xUrl;
    private Boolean contractEnabled;
    private Boolean unlockEnabled;
    @JSONField(name = "group_id")
    private String groupId;
    @JSONField(name = "subfamily_id")
    private String subfamilyId;

    /**
     * @return The partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber The part_number
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * @return The productDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * @param productDescription The productDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * @return The capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * @param capacity The capacity
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * @return The productDisplayPrice
     */
    public String getProductDisplayPrice() {
        return productDisplayPrice;
    }

    /**
     * @param productDisplayPrice The productDisplayPrice
     */
    public void setProductDisplayPrice(String productDisplayPrice) {
        this.productDisplayPrice = productDisplayPrice;
    }

    /**
     * @return The discountPrice
     */
    public String getDiscountPrice() {
        return discountPrice;
    }

    /**
     * @param discountPrice The discount_price
     */
    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * @return The colorSortOrder
     */
    public String getColorSortOrder() {
        return colorSortOrder;
    }

    /**
     * @param colorSortOrder The colorSortOrder
     */
    public void setColorSortOrder(String colorSortOrder) {
        this.colorSortOrder = colorSortOrder;
    }

    /**
     * @return The installmentPrice
     */
    public String getInstallmentPrice() {
        return installmentPrice;
    }

    /**
     * @param installmentPrice The installmentPrice
     */
    public void setInstallmentPrice(String installmentPrice) {
        this.installmentPrice = installmentPrice;
    }

    /**
     * @return The installmentPeriod
     */
    public String getInstallmentPeriod() {
        return installmentPeriod;
    }

    /**
     * @param installmentPeriod The installmentPeriod
     */
    public void setInstallmentPeriod(String installmentPeriod) {
        this.installmentPeriod = installmentPeriod;
    }

    /**
     * @return The color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return The ippPrice
     */
    public String getIppPrice() {
        return ippPrice;
    }

    /**
     * @param ippPrice The ipp_price
     */
    public void setIppPrice(String ippPrice) {
        this.ippPrice = ippPrice;
    }

    /**
     * @return The ippInstallments
     */
    public String getIppInstallments() {
        return ippInstallments;
    }

    /**
     * @param ippInstallments The ipp_installments
     */
    public void setIppInstallments(String ippInstallments) {
        this.ippInstallments = ippInstallments;
    }

    /**
     * @return The colorSwatchUrl
     */
    public String getColorSwatchUrl() {
        return colorSwatchUrl;
    }

    /**
     * @param colorSwatchUrl The color_swatch_url
     */
    public void setColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl;
    }

    /**
     * @return The colorSwatchRetinaUrl
     */
    public String getColorSwatchRetinaUrl() {
        return colorSwatchRetinaUrl;
    }

    /**
     * @param colorSwatchRetinaUrl The color_swatch_retina_url
     */
    public void setColorSwatchRetinaUrl(String colorSwatchRetinaUrl) {
        this.colorSwatchRetinaUrl = colorSwatchRetinaUrl;
    }

    /**
     * @return The colorSwatch3xUrl
     */
    public String getColorSwatch3xUrl() {
        return colorSwatch3xUrl;
    }

    /**
     * @param colorSwatch3xUrl The colorSwatch3xUrl
     */
    public void setColorSwatch3xUrl(String colorSwatch3xUrl) {
        this.colorSwatch3xUrl = colorSwatch3xUrl;
    }

    /**
     * @return The productImageURL
     */
    public String getProductImageURL() {
        return productImageURL;
    }

    /**
     * @param productImageURL The productImageURL
     */
    public void setProductImageURL(String productImageURL) {
        this.productImageURL = productImageURL;
    }

    /**
     * @return The productImageURL2x
     */
    public String getProductImageURL2x() {
        return productImageURL2x;
    }

    /**
     * @param productImageURL2x The productImageURL2x
     */
    public void setProductImageURL2x(String productImageURL2x) {
        this.productImageURL2x = productImageURL2x;
    }

    /**
     * @return The productImage3xUrl
     */
    public String getProductImage3xUrl() {
        return productImage3xUrl;
    }

    /**
     * @param productImage3xUrl The productImage3xUrl
     */
    public void setProductImage3xUrl(String productImage3xUrl) {
        this.productImage3xUrl = productImage3xUrl;
    }

    /**
     * @return The contractEnabled
     */
    public Boolean getContractEnabled() {
        return contractEnabled;
    }

    /**
     * @param contractEnabled The contractEnabled
     */
    public void setContractEnabled(Boolean contractEnabled) {
        this.contractEnabled = contractEnabled;
    }

    /**
     * @return The unlockEnabled
     */
    public Boolean getUnlockEnabled() {
        return unlockEnabled;
    }

    /**
     * @param unlockEnabled The unlockEnabled
     */
    public void setUnlockEnabled(Boolean unlockEnabled) {
        this.unlockEnabled = unlockEnabled;
    }

    /**
     * @return The groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId The group_id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * @return The subfamilyId
     */
    public String getSubfamilyId() {
        return subfamilyId;
    }

    /**
     * @param subfamilyId The subfamily_id
     */
    public void setSubfamilyId(String subfamilyId) {
        this.subfamilyId = subfamilyId;
    }

}
