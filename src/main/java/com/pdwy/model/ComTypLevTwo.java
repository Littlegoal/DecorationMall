package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒ���������
 * Created by MaYunpeng on 2016/9/1.
 * @author
 */
public class ComTypLevTwo implements Serializable{
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //��������id
    private Long levTwoId;
    //������������
    private String levTwoName;
    //����һ������id
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
