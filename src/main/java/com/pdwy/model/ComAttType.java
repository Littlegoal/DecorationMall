package com.pdwy.model;

import java.io.Serializable;

/**
 * 商品属性类别表
 * Created by MaYunpeng on 2016/9/1.
 */
public class ComAttType implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //商品属性类别id
    private Long comAttTypId;
    //商品属性类别名称
    private String comAttTypName;
    //商品三级类别id
    private Long comTypId;

    public Long getComAttTypId() {
        return comAttTypId;
    }

    public void setComAttTypId(Long comAttTypId) {
        this.comAttTypId = comAttTypId;
    }

    public String getComAttTypName() {
        return comAttTypName;
    }

    public void setComAttTypName(String comAttTypName) {
        this.comAttTypName = comAttTypName;
    }

    public Long getComTypId() {
        return comTypId;
    }

    public void setComTypId(Long comTypId) {
        this.comTypId = comTypId;
    }
}
