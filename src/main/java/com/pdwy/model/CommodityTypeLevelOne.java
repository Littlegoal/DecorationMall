package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒһ�������
 * @author MaYunpeng
 * @version 1.0
 */
public class CommodityTypeLevelOne implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //��Ʒһ������id
    private Long typeLevelOneId;
    //��Ʒһ����������
    private String typeLevelOneName;
    //ɾ�����λ,δɾ��Ϊ1,��ɾ��Ϊ0
    private int isDeleted;
    //������ʱ��
    private String updateTime;

    public Long getTypeLevelOneId() {
        return typeLevelOneId;
    }

    public void setTypeLevelOneId(Long typeLevelOneId) {
        this.typeLevelOneId = typeLevelOneId;
    }

    public String getTypeLevelOneName() {
        return typeLevelOneName;
    }

    public void setTypeLevelOneName(String typeLevelOneName) {
        this.typeLevelOneName = typeLevelOneName;
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
