package com.pdwy.model;

import java.io.Serializable;

/**
 * �̼ұ�
 * Created by XinLian on 2016/8/30.
 */
public class Shop implements Serializable{
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //�̼�id
    private Long shopId;
    //�̼�����
    private String shopName;

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
}
