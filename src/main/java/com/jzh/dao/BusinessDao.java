package com.jzh.dao;

import com.jzh.model.Business;
import com.jzh.model.Customer;

import java.util.List;

/**
 * @author Junhao Zhou 2016/11/16
 * @version 1.0
 */
public interface BusinessDao extends GenericDao<Business, Long> {

    List<Business> listAll();

    Business get(final Long id);

    int insert(Business customer);

    int update(Business customer);

    int delete(final Long id);
}
