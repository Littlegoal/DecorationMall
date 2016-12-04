package com.jzh.model;

/**
 * ��Ʒ��
 * @author Yun
 * @version 1.0
 */
public class Commodity implements java.io.Serializable {
    static final long serialVersionUID = 1L;
    /**
     * ��Ʒid
     */
    private Long id;
    /**
     * ��Ʒ���id
     */
    private Long typeId;
    /**
     * ��Ʒ����
     */
    private String name;
    /**
     * ��Ʒ�۸�
     */
    private double price;
    /**
     * ���� {@see Shop.id} ���̱��id
     */
    private Long shopId;
    /**
     * ��ͼƬ����������ͼƬ����{@see com.jzh.constant.Constants.Commondity}����ָ����
     */
    private String imgPrincipal;
    /**
     * Ч��ͼ����{@see com.jzh.constant.Constants.Commondity}����ָ����
     */
    private String imgDrawing;
    /**
     *ʵ��ͼ����{@see com.jzh.constant.Constants.Commondity}����ָ����
     */
    private String imgShot;
    /**
     * �ߴ�ͼ����{@see com.jzh.constant.Constants.Commondity}����ָ����
     */
    private String imgSize;
    /**
     * ϸ��ͼ����{@see com.jzh.constant.Constants.Commondity}����ָ����
     */
    private String imgDetail;
    /**
     * ����ͼ����{@see com.jzh.constant.Constants.Commondity}����ָ����
     */
    private String imgMaterial;
    /**
     * ����ͼ����{@see com.jzh.constant.Constants.Commondity}����ָ����
     */
    private String imgAdvantage;
    /**
     * ��Ʒ����
     */
    private String introduce;
    /**
     * ɾ�����λ��δɾ��Ϊ1����ɾ��Ϊ0
     */
    private int isDeleted;
    /**
     * ������ʱ��
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
