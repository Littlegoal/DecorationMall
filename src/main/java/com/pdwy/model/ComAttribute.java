package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒ���Ա�
 * Created by MaYunpeng on 2016/9/1.
 */
public class ComAttribute implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //��Ʒid
    private Long comId;
    //��Ʒ����id
    private Long comAttId;
    //��Ʒ����ֵ
    private String comAttName;

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Long getComAttId() {
        return comAttId;
    }

    public void setComAttId(Long comAttId) {
        this.comAttId = comAttId;
    }

    public String getComAttName() {
        return comAttName;
    }

    public void setComAttName(String comAttName) {
        this.comAttName = comAttName;
    }
}
