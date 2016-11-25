package com.jzh.service.impl;

import com.jzh.dao.CustomerDao;
import com.jzh.model.Customer;
import com.jzh.service.CustomerService;
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
    public CustomerServiceImpl(CustomerDao<Customer, Long> customerDao) {
        super(customerDao);
        this.customerDao = customerDao;
    }
}
