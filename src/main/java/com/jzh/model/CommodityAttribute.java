package com.jzh.model;

/**
 * @author Yun
 * @version 1.0.
 */
public class CommodityAttribute implements java.io.Serializable{
    static final long serialVersionUID = 1L;
//    /**
//     * 主键id
//     */
//    private Long id;
    /**
     * 商品id，外键关联{@see Commoditiy.id}
     */
    private Long commodityId;
    /**
     * 属性id，主键
     */
    private Long attributeId;
    /**
     * 属性值
     */
    private String attributeValue;
    /**
     * 删除标记位，未删除为1，已删除为0
     */
    private int isDelete;
    /**
     * 更新时间
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
