package com.jzh.service;

import com.jzh.model.Business;

import java.util.List;

/**
 * @author Junhao Zhou 2016/11/25
 * @version 1.0
 */
public interface BusinessService extends GenericService<Business, Long> {

    @Override
    List<Business> listAll();

    @Override
    Business get(final Long id);

    @Override
    int insert(Business entity);

    @Override
    int update(Business entity);

    @Override
    int delete(final Long id);
}
