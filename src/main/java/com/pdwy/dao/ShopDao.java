package com.pdwy.dao;

import com.pdwy.model.Shop;

import java.util.List;

/**
 * Created by XinLian on 2016/8/30.
 */
public interface ShopDao extends GenericDao <Shop, Long> {

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
