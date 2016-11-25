package com.jzh.service;

import com.jzh.model.Shop;

import java.util.List;

/**
 * @author Junhao Zhou 2016/11/16
 * @version 1.0
 */
public interface ShopService extends GenericService<Shop, Long> {

    @Override
    List<Shop> listAll();

    @Override
    Shop get(final Long id);

    @Override
    int insert(Shop entity);

    @Override
    int update(Shop entity);

    @Override
    int delete(final Long id);
}
