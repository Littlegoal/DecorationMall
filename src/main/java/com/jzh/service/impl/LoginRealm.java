package com.jzh.service.impl;

import com.jzh.dao.CustomerDao;
import com.jzh.model.Customer;
import com.jzh.utils.Log;
import com.jzh.utils.shiro.AccountTypeToken;
import com.jzh.utils.shiro.OAuth2Token;
import com.jzh.utils.shiro.PhonePasswordToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Junhao Zhou 2016/12/18
 */
public class LoginRealm extends AuthorizingRealm {

    private static Log logger = Log.getLog(LoginRealm.class);

    @Autowired
    private CustomerDao customerDao;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof PhonePasswordToken
                || token instanceof OAuth2Token
                || super.supports(token);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        // TODO 防重放攻击

        if (authenticationToken instanceof AccountTypeToken) {
            return dispatchLogin(authenticationToken);
        }
        return null;

    }


    private AuthenticationInfo dispatchLogin(AuthenticationToken token) throws AuthenticationException {
        AuthenticationInfo info = null;
        if (token instanceof PhonePasswordToken) {
            info = doLoginNormal((PhonePasswordToken) token);
        } else if (token instanceof OAuth2Token) {

        } else {
            String message = String.format("AuthenticationToken< %s > unsupported", token.getClass().getName());
            logger.warn(message);
            throw new AuthenticationException(message);
        }
        return info;
    }

    private AuthenticationInfo doLoginNormal(PhonePasswordToken token) throws AuthenticationException {
        String phone = token.getPhone();
        List<String> salts = null;
        try {
            salts = customerDao.getSalt(phone);
        } catch (Exception e) {
            logger.warn("", e);
            e.printStackTrace();
        }
        if (salts == null || salts.size() != 1) { // salts 只能为1
            throw new AuthenticationException();
        }
        // TODO 密码拼接salt后哈希
        String password = new String(token.getPassword());
        List<Customer> results = null;
        try {
            results = customerDao.login(phone, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (results == null || results.size() != 1) {
            throw new AuthenticationException(); // results大小只能为1
        }
        return new SimpleAuthenticationInfo(
                phone, password, results.get(0).getNickname());
    }
}
