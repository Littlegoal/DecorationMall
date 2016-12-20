package com.jzh.service;

import com.jzh.dto.Result;
import com.jzh.model.Customer;

import java.util.List;

/**
 * @author Junhao Zhou 2016/11/25
 * @version 1.0
 */
public interface CustomerService extends GenericService<Customer, Long> {

    @Override
    List<Customer> listAll();

    @Override
    Customer get(final Long id);

    @Override
    int insert(Customer entity);

    @Override
    int update(Customer entity);

    @Override
    int delete(final Long id);

    /**
     * 普通登录
     *
     * @param phone      用户手机号
     * @param password   密码
     * @param rememberMe 是否"记住我"
     * @return 登录结果
     */
    Result login(String phone, char[] password, boolean rememberMe);

    /**
     * 登出
     *
     * @return 登出结果
     */
    Result logout();
}
