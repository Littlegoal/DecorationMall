package com.jzh.dao;

import com.jzh.model.Customer;

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
}
