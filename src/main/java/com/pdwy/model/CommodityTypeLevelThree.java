package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒ������Ʒ���������
 * @author MaYunpeng
 * @version 1.0
 */
public class CommodityTypeLevelThree implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L;
    //��Ʒ��������id
    private Long typeLevelThreeId;
    //��Ʒ������������
    private String typeLevelThreeName;
    //��Ʒ��������id
    private Long typeLevelTwoId;
    //ɾ�����λ,δɾ��Ϊ1,��ɾ��Ϊ0
    private int isDeleted;
    //������ʱ��
    private String updateTime;

    public Long getTypeLevelThreeId() {
        return typeLevelThreeId;
    }

    public void setTypeLevelThreeId(Long typeLevelThreeId) {
        this.typeLevelThreeId = typeLevelThreeId;
    }

    public String getTypeLevelThreeName() {
        return typeLevelThreeName;
    }

    public void setTypeLevelThreeName(String typeLevelThreeName) {
        this.typeLevelThreeName = typeLevelThreeName;
    }

    public Long getTypeLevelTwoId() {
        return typeLevelTwoId;
    }

    public void setTypeLevelTwoId(Long typeLevelTwoId) {
        this.typeLevelTwoId = typeLevelTwoId;
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
