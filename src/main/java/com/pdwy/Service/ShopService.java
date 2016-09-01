package com.pdwy.service;

import com.pdwy.model.Shop;

import java.util.List;

/**
 * Created by MaYunpeng on 2016/8/30.
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
    int delete(Shop entity);
}
