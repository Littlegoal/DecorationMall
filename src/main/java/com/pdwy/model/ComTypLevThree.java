package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒ���������
 * Created by MaYunpeng on 2016/9/1.
 */
public class ComTypLevThree implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //��������id
    private Long levThrId;
    //������������
    private String levThrName;
    //������������id
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
