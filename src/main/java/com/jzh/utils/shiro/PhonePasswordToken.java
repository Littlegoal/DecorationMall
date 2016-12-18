package com.jzh.utils.shiro;

import com.jzh.model.AccountType;
import org.apache.shiro.authc.RememberMeAuthenticationToken;

/**
 * PhonePasswordToken
 *
 * @author Junhao Zhou 2016/12/18
 */
public class PhonePasswordToken implements AccountTypeToken, RememberMeAuthenticationToken {

    private AccountType accountType;

    private String phone;

    private char[] password;

    private boolean rememberMe;

    public PhonePasswordToken(AccountType accountType) {
        this(accountType, null, (char[]) null, false);
    }

    public PhonePasswordToken(AccountType accountType, String phone, String password) {
        this(accountType, phone, password == null ? null : password.toCharArray(), false);
    }

    public PhonePasswordToken(AccountType accountType, String phone, char[] password) {
        this(accountType, phone, password, false);
    }

    public PhonePasswordToken(AccountType accountType, String phone, String password, boolean rememberMe) {
        this(accountType, phone, password == null ? null : password.toCharArray(), false);
    }

    public PhonePasswordToken(AccountType accountType, String phone, char[] password, boolean rememberMe) {
        this.accountType = accountType;
        this.phone = phone;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public AccountType getAccountType() {
        return accountType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    @Override
    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    @Override
    public String getPrincipal() {
        return phone;
    }

    @Override
    public char[] getCredentials() {
        return password;
    }

    /**
     * 主要是清除密码
     */
    public void clear() {
        accountType = null;
        if (password != null) {
            for (int i = 0; i < password.length; i++) {
                password[i] = 0;
            }
        }
        password = null;
        phone = null;
        rememberMe = false;
    }
}
