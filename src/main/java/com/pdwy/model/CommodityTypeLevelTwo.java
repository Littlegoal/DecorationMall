package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒ���������
 * @author MaYunpeng
 * @version 1.0
 */
public class CommodityTypeLevelTwo implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //��Ʒ��������id
    private Long typeLevelTwoId;
    //��Ʒ������������
    private String typeLevelTwoName;
    //��Ʒһ������id
    private Long typeLevelOneId;
    //ɾ�����λ,δɾ��Ϊ1,��ɾ��Ϊ0
    private int isDeleted;
    //������ʱ��
    private String updateTime;

    public Long getTypeLevelTwoId() {
        return typeLevelTwoId;
    }

    public void setTypeLevelTwoId(Long typeLevelTwoId) {
        this.typeLevelTwoId = typeLevelTwoId;
    }

    public String getTypeLevelTwoName() {
        return typeLevelTwoName;
    }

    public void setTypeLevelTwoName(String typeLevelTwoName) {
        this.typeLevelTwoName = typeLevelTwoName;
    }

    public Long getTypeLevelOneId() {
        return typeLevelOneId;
    }

    public void setTypeLevelOneId(Long typeLevelOneId) {
        this.typeLevelOneId = typeLevelOneId;
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
