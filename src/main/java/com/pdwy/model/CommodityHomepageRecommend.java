package com.pdwy.model;

import java.io.Serializable;

/**
 * ��װ��ҳ��Ʒ�Ƽ���
 * @author MaYunpeng
 * @version 1.0
 */
public class CommodityHomepageRecommend implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //��װ��ҳ�Ƽ���Ʒ��id
    private Long id;
    //��Ʒ��������id
    private Long typeLevelTwoId;
    //����id
    private Long shopId;
    //��������
    private String shopName;
    //��Ʒid
    private Long commodityId;
    //��Ʒ����
    private String  commodityName;
    //��Ʒ�۸�
    private Double commodityPrice;
    //��ƷͼƬ
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
