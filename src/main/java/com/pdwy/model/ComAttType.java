package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒ��������
 * Created by MaYunpeng on 2016/9/1.
 */
public class ComAttType implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //��Ʒ�������id
    private Long comAttTypId;
    //��Ʒ�����������
    private String comAttTypName;
    //��Ʒ�������id
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
