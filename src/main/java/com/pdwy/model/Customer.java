package com.pdwy.model;

import java.io.Serializable;

/**
 * �û���
 * Created by MaYunpeng on 2016/9/1.
 */
public class Customer implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //�û�id
    private Long cusId;
    //�˺�
    private String cusAccount;
    //����
    private String cusPwd;

    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public String getCusAccount() {
        return cusAccount;
    }

    public void setCusAccount(String cusAccount) {
        this.cusAccount = cusAccount;
    }

    public String getCusPwd() {
        return cusPwd;
    }

    public void setCusPwd(String cusPwd) {
        this.cusPwd = cusPwd;
    }
}
