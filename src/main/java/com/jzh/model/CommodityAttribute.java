package com.jzh.model;

/**
 * @author Yun
 * @version 1.0.
 */
public class CommodityAttribute implements java.io.Serializable{
    static final long serialVersionUID = 1L;
//    /**
//     * ����id
//     */
//    private Long id;
    /**
     * ��Ʒid���������{@see Commoditiy.id}
     */
    private Long commodityId;
    /**
     * ����id������
     */
    private Long attributeId;
    /**
     * ����ֵ
     */
    private String attributeValue;
    /**
     * ɾ�����λ��δɾ��Ϊ1����ɾ��Ϊ0
     */
    private int isDelete;
    /**
     * ����ʱ��
     */
    private String updateTime;

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
