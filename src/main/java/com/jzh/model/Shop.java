package com.jzh.model;

import java.io.Serializable;
import java.util.List;

/**
 * 店铺实体
 *
 * @author Junhao Zhou
 * @version 1.0
 */
public class Shop implements Serializable {
    /**
     * default id
     */
    private static final long serialVersionUID = 1L;

    /**
     * 店铺id
     */
    private Long id;

    /**
     * 商家名
     */
    private String name;

    /**
     * 简介
     */
    private String introduce;

    /**
     * 地址
     */
    private String address;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 二维码链接
     */
    private String qrCode;

    /**
     * 商铺展示图
     */
    private String displayImage;

    /**
     * qq
     */
    private String qq;

    /**
     * 商铺商品类型集合
     */
    private List<Long> commodityTypes;

    /**
     * 最近更新时间
     */
    private String latestUpdateTime;

    /**
     * 删除标记位
     */
    private int isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getDisplayImage() {
        return displayImage;
    }

    public void setDisplayImage(String displayImage) {
        this.displayImage = displayImage;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public List<Long> getCommodityTypes() {
        return commodityTypes;
    }

    public void setCommodityTypes(List<Long> commodityTypes) {
        this.commodityTypes = commodityTypes;
    }

    public String getLatestUpdateTime() {
        return latestUpdateTime;
    }

    public void setLatestUpdateTime(String latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
