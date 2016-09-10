package com.pdwy.model;

import java.io.Serializable;

/**
 * 商品一级分类表
 * @author MaYunpeng
 * @version 1.0
 */
public class CommodityTypeLevelOne implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //商品一级分类id
    private Long typeLevelOneId;
    //商品一级分类名称
    private String typeLevelOneName;
    //删除标记位,未删除为1,已删除为0
    private int isDeleted;
    //最后更新时间
    private String updateTime;

    public Long getTypeLevelOneId() {
        return typeLevelOneId;
    }

    public void setTypeLevelOneId(Long typeLevelOneId) {
        this.typeLevelOneId = typeLevelOneId;
    }

    public String getTypeLevelOneName() {
        return typeLevelOneName;
    }

    public void setTypeLevelOneName(String typeLevelOneName) {
        this.typeLevelOneName = typeLevelOneName;
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
