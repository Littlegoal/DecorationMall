package com.pdwy.model;

import java.io.Serializable;

/**
 * 商品类别表（商品三级分类表）
 * @author MaYunpeng
 * @version 1.0
 */
public class CommodityTypeLevelThree implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //商品三级分类id
    private Long typeLevelThreeId;
    //商品三级分类名称
    private String typeLevelThreeName;
    //商品二级分类id
    private Long typeLevelTwoId;
    //删除标记位,未删除为1,已删除为0
    private int isDeleted;
    //最后更新时间
    private String updateTime;

    public Long getTypeLevelThreeId() {
        return typeLevelThreeId;
    }

    public void setTypeLevelThreeId(Long typeLevelThreeId) {
        this.typeLevelThreeId = typeLevelThreeId;
    }

    public String getTypeLevelThreeName() {
        return typeLevelThreeName;
    }

    public void setTypeLevelThreeName(String typeLevelThreeName) {
        this.typeLevelThreeName = typeLevelThreeName;
    }

    public Long getTypeLevelTwoId() {
        return typeLevelTwoId;
    }

    public void setTypeLevelTwoId(Long typeLevelTwoId) {
        this.typeLevelTwoId = typeLevelTwoId;
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
