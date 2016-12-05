package com.jzh.model;

/**
 * @author Yun
 * @version 1.0.
 */
public class CommodityAttributeType implements java.io.Serializable {
    static final long serialVersionUID = 1L;
    /**
     * 商品属性类型id，主键
     */
    private Long id;
    /**
     * 商品属性类型名称
     */
    private String name;
    /**
     * 商品类型所具有商品属性，外键关联{@see CommodityTypeLevelThree.id}
     */
    private Long commodityTypeLevelThreeId;
    /**
     * 删除标记位，未删除为1，已删除为0
     */
    private int isDelete;
    /**
     * 更新时间
     */
    private String updateTime;

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

    public Long getCommodityTypeLevelThreeId() {
        return commodityTypeLevelThreeId;
    }

    public void setCommodityTypeLevelThreeId(Long commodityTypeLevelThreeId) {
        this.commodityTypeLevelThreeId = commodityTypeLevelThreeId;
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
