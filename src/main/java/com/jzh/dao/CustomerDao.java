package com.jzh.dao;

import com.jzh.model.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Junhao Zhou 2016/11/16
 * @version 1.0
 */
public interface CustomerDao extends GenericDao<Customer, Long> {

    List<Customer> listAll();

    Customer get(final Long id);

    int insert(Customer customer);

    int update(Customer customer);

    int delete(final Long id);

    /**
     * 登录
     *
     * @param phone    手机号
     * @param password 密码
     * @return 操作结果
     */
    List<Customer> login(@Param("account") String phone, @Param("password") String password);

    /**
     * 获取盐值
     *
     * @param phone 手机号
     * @return 盐值
     */
    List<String> getSalt(@Param("account") String phone);

    /**
     * 更新盐值
     *
     * @param phone 手机号
     * @param salt  盐值
     * @return 操作结果
     */
    int updateSalt(@Param("account") String phone, @Param("salt") String salt);

    /**
     * 检查手机号是否存在
     *
     * @param phone 手机号
     * @return 结果
     */
    int checkPhone(@Param("account") String phone);
}
