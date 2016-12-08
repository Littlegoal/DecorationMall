package com.jzh.model;

import java.io.Serializable;

/**
 * 商品表
 * @author Yun
 * @version 1.0
 */
public class Commodity implements Serializable {
    static final long serialVersionUID = 1L;
    /**
     * 商品id
     */
    private Long id;
    /**
     * 商品类别id
     */
    private Long typeId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private double price;
    /**
     * 关联 {@see Shop.id} 店铺表的id
     */
    private Long shopId;
    /**
     * 主图片，即可缩放图片，以{@see com.jzh.constant.Constants.Commondity}定义分割规则
     */
    private String imgPrincipal;
    /**
     * 效果图，以{@see com.jzh.constant.Constants.Commondity}定义分割规则
     */
    private String imgDrawing;
    /**
     *实拍图，以{@see com.jzh.constant.Constants.Commondity}定义分割规则
     */
    private String imgShot;
    /**
     * 尺寸图，以{@see com.jzh.constant.Constants.Commondity}定义分割规则
     */
    private String imgSize;
    /**
     * 细节图，以{@see com.jzh.constant.Constants.Commondity}定义分割规则
     */
    private String imgDetail;
    /**
     * 材质图，以{@see com.jzh.constant.Constants.Commondity}定义分割规则
     */
    private String imgMaterial;
    /**
     * 优势图，以{@see com.jzh.constant.Constants.Commondity}定义分割规则
     */
    private String imgAdvantage;
    /**
     * 商品介绍
     */
    private String introduce;
    /**
     * 删除标记位，未删除为1，已删除为0
     */
    private int isDeleted;
    /**
     * 最后更新时间
     */
    private String updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getImgPrincipal() {
        return imgPrincipal;
    }

    public void setImgPrincipal(String imgPrincipal) {
        this.imgPrincipal = imgPrincipal;
    }

    public String getImgDrawing() {
        return imgDrawing;
    }

    public void setImgDrawing(String imgDrawing) {
        this.imgDrawing = imgDrawing;
    }

    public String getImgShot() {
        return imgShot;
    }

    public void setImgShot(String imgShot) {
        this.imgShot = imgShot;
    }

    public String getImgSize() {
        return imgSize;
    }

    public void setImgSize(String imgSize) {
        this.imgSize = imgSize;
    }

    public String getImgDetail() {
        return imgDetail;
    }

    public void setImgDetail(String imgDetail) {
        this.imgDetail = imgDetail;
    }

    public String getImgMaterial() {
        return imgMaterial;
    }

    public void setImgMaterial(String imgMaterial) {
        this.imgMaterial = imgMaterial;
    }

    public String getImgAdvantage() {
        return imgAdvantage;
    }

    public void setImgAdvantage(String imgAdvantage) {
        this.imgAdvantage = imgAdvantage;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
