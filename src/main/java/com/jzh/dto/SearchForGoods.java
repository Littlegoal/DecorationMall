package com.jzh.dto;

import java.io.Serializable;
import java.util.List;

/**
 *搜索商品信息——搜索商品页面
 *
 * @author Yunpeng Ma
 * @version 1.0
 */
public class SearchForGoods implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 搜索关键字集合
     */
    private List<String> keywords;


    /**
     * 商品数量
     */
    private Long goodsCount;

    /**
     * 搜索商品集合
     */
    private List<Goods> goods;

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Long getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Long goodsCount) {
        this.goodsCount = goodsCount;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
