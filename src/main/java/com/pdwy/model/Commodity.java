package com.pdwy.model;

import java.io.Serializable;

/**
 * ��Ʒ��
 * Created by MaYunpeng on 2016/9/1.
 */
public class Commodity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //��Ʒid
    private Long comId;
    //��Ʒ���id
    private Long comTypId;
    //��Ʒ����
    private String comName;
    //��Ʒ�۸�
    private Double price;
    //�̼�id
    private Long shoId;

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Long getComTypId() {
        return comTypId;
    }

    public void setComTypId(Long comTypId) {
        this.comTypId = comTypId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getShoId() {
        return shoId;
    }

    public void setShoId(Long shoId) {
        this.shoId = shoId;
    }
}
