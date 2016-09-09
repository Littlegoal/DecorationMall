package com.pdwy.model;

import java.io.Serializable;

/**
 * 商品二级分类表
 * Created by MaYunpeng on 2016/9/1.
 * @author
 */
public class ComTypLevTwo implements Serializable{
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //二级分类id
    private Long levTwoId;
    //二级分类名称
    private String levTwoName;
    //所属一级分类id
    private Long levOneId;

    public Long getLevTwoId() {
        return levTwoId;
    }

    public void setLevTwoId(Long levTwoId) {
        this.levTwoId = levTwoId;
    }

    public String getLevTwoName() {
        return levTwoName;
    }

    public void setLevTwoName(String levTwoName) {
        this.levTwoName = levTwoName;
    }

    public Long getLevOneId() {
        return levOneId;
    }

    public void setLevOneId(Long levOneId) {
        this.levOneId = levOneId;
    }
}
