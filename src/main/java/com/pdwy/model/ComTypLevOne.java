package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒһ�������
 * Created by MaYunpeng on 2016/9/1.
 */
public class ComTypLevOne implements Serializable {

    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //һ������id
    private Long levOneId;
    //һ����������
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
