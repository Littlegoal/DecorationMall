package com.pdwy.model;

import java.io.Serializable;

/**
 * 商家客户表
 * Created by MaYunpeng on 2016/9/1.
 */
public class ComClient implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //客户id
    private Long cliId;
    //账号
    private String cliAccount;
    //密码
    private String cliPwd;

    public Long getCliId() {
        return cliId;
    }

    public void setCliId(Long cliId) {
        this.cliId = cliId;
    }

    public String getCliAccount() {
        return cliAccount;
    }

    public void setCliAccount(String cliAccount) {
        this.cliAccount = cliAccount;
    }

    public String getCliPwd() {
        return cliPwd;
    }

    public void setCliPwd(String cliPwd) {
        this.cliPwd = cliPwd;
    }
}
