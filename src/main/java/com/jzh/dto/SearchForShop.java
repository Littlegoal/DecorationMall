package com.jzh.dto;


import java.io.Serializable;
import java.util.List;

/**
 * 搜索店铺信息——搜索店铺页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class SearchForShop implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 搜索关键字集合
     */
    private List<String> keywords;

    /**
     * 搜索店铺数量
     */
    private Long shopCount;

    /**
     * 搜索店铺集合
     */
    private List<ShopInfo> shopInfo;

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Long getShopCount() {
        return shopCount;
    }

    public void setShopCount(Long shopCount) {
        this.shopCount = shopCount;
    }

    public List<ShopInfo> getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(List<ShopInfo> shopInfo) {
        this.shopInfo = shopInfo;
    }
}
