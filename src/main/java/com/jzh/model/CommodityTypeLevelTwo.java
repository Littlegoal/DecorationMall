package com.jzh.model;

import java.io.Serializable;

/**
 * 商品二级分类表
 * @author Yunpeng Ma
 * @version 1.0
 */
public class CommodityTypeLevelTwo implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;

    /**
     * 商品二级分类id
     */
    private Long typeLevelTwoId;

    /**
     * 商品二级分类名称
     */
    private String typeLevelTwoName;

    /**
     * 商品一级分类id
     */
    private Long typeLevelOneId;

    /**
     * 删除标记位,未删除为1,已删除为0
     */
    private int isDeleted;

    /**
     * 最后更新时间
     */
    private String updateTime;

    public Long getTypeLevelTwoId() {
        return typeLevelTwoId;
    }

    public void setTypeLevelTwoId(Long typeLevelTwoId) {
        this.typeLevelTwoId = typeLevelTwoId;
    }

    public String getTypeLevelTwoName() {
        return typeLevelTwoName;
    }

    public void setTypeLevelTwoName(String typeLevelTwoName) {
        this.typeLevelTwoName = typeLevelTwoName;
    }

    public Long getTypeLevelOneId() {
        return typeLevelOneId;
    }

    public void setTypeLevelOneId(Long typeLevelOneId) {
        this.typeLevelOneId = typeLevelOneId;
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
