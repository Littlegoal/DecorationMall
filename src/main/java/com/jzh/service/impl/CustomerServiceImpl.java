package com.jzh.service.impl;

import com.jzh.dao.CustomerDao;
import com.jzh.dto.Result;
import com.jzh.model.AccountType;
import com.jzh.model.Customer;
import com.jzh.service.CustomerService;
import com.jzh.utils.shiro.PhonePasswordToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Junhao Zhou 2016/11/25
 * @version 1.0
 */
@Service("CustomerService")
public class CustomerServiceImpl extends GenericServiceImpl<Customer, Long>
        implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        super(customerDao);
        this.customerDao = customerDao;
    }

    @Override
    public Result login(String phone, char[] password, boolean rememberMe) {
        Subject user = SecurityUtils.getSubject();
        Result result = new Result();
        if (!user.isAuthenticated()) { // 用户还没登录
            PhonePasswordToken token =
                    new PhonePasswordToken(AccountType.Customer, phone, password, rememberMe);
            try {
                user.login(token);
                result.setSuccess(true);
                result.setMessage("登录成功");
            } catch (AuthenticationException e) {
                result.setSuccess(false);
                result.setMessage("登录失败！请检查用户名或者密码。");
            }
        } else {
            result.setSuccess(false);
            result.setMessage("请不要重复登录");
        }
        return result;
    }

    @Override
    public Result logout() {
        Result result = new Result();
        Subject user = SecurityUtils.getSubject();
        if (!user.isAuthenticated()) {
            result.setSuccess(false);
            result.setMessage("并没有登录！");
            return result;
        }
        user.logout();
        result.setSuccess(true);
        return result;
    }

}
