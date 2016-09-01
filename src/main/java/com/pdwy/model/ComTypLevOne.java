package com.pdwy.model;

import java.io.Serializable;

/**
 * 商品一级分类表
 * Created by MaYunpeng on 2016/9/1.
 */
public class ComTypLevOne implements Serializable {

    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //一级分类id
    private Long levOneId;
    //一级分类名称
    private String levOneName;

    public Long getLevOneId() {
        return levOneId;
    }

    public void setLevOneId(Long levOneId) {
        this.levOneId = levOneId;
    }

    public String getLevOneName() {
        return levOneName;
    }

    public void setLevOneName(String levOneName) {
        this.levOneName = levOneName;
    }
}
