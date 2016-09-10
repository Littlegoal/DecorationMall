package com.pdwy.model;

import java.io.Serializable;

/**
 * 家装首页商品推荐表
 * @author MaYunpeng
 * @version 1.0
 */
public class CommodityHomepageRecommend implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //家装首页推荐商品项id
    private Long id;
    //商品二级分类id
    private Long typeLevelTwoId;
    //店铺id
    private Long shopId;
    //店铺名称
    private String shopName;
    //商品id
    private Long commodityId;
    //商品名称
    private String  commodityName;
    //商品价格
    private Double commodityPrice;
    //商品图片
    private String commodityImg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeLevelTwoId() {
        return typeLevelTwoId;
    }

    public void setTypeLevelTwoId(Long typeLevelTwoId) {
        this.typeLevelTwoId = typeLevelTwoId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityImg() {
        return commodityImg;
    }

    public void setCommodityImg(String commodityImg) {
        this.commodityImg = commodityImg;
    }
}
