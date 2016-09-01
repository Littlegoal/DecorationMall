package com.pdwy.model;

import java.io.Serializable;

/**
 * 商品三级分类表
 * Created by MaYunpeng on 2016/9/1.
 */
public class ComTypLevThree implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //三级分类id
    private Long levThrId;
    //三级分类名称
    private String levThrName;
    //所属二级分类id
    private Long levTwoId;

    public Long getLevThrId() {
        return levThrId;
    }

    public void setLevThrId(Long levThrId) {
        this.levThrId = levThrId;
    }

    public String getLevThrName() {
        return levThrName;
    }

    public void setLevThrName(String levThrName) {
        this.levThrName = levThrName;
    }

    public Long getLevTwoId() {
        return levTwoId;
    }

    public void setLevTwoId(Long levTwoId) {
        this.levTwoId = levTwoId;
    }
}
