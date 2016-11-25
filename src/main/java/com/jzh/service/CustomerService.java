package com.jzh.service;

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
}
