package com.jzh.model;

/**
 * @author Yun
 * @version 1.0.
 */
public class CommodityAttributeType implements java.io.Serializable {
    static final long serialVersionUID = 1L;
    /**
     * ��Ʒ��������id������
     */
    private Long id;
    /**
     * ��Ʒ������������
     */
    private String name;
    /**
     * ��Ʒ������������Ʒ���ԣ��������{@see CommodityTypeLevelThree.id}
     */
    private Long commodityTypeLevelThreeId;
    /**
     * ɾ�����λ��δɾ��Ϊ1����ɾ��Ϊ0
     */
    private int isDelete;
    /**
     * ����ʱ��
     */
    private String updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCommodityTypeLevelThreeId() {
        return commodityTypeLevelThreeId;
    }

    public void setCommodityTypeLevelThreeId(Long commodityTypeLevelThreeId) {
        this.commodityTypeLevelThreeId = commodityTypeLevelThreeId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
