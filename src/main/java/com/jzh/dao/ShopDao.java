package com.jzh.dao;

import com.jzh.model.Shop;

import java.util.List;

/**
 * ShopDao
 *
 * @author Junhao Zhou
 * @version 1.0
 */
public interface ShopDao extends GenericDao<Shop, Long> {

    List<Shop> listAll();

    Shop get(final Long id);

    int insert(Shop entity);

    int update(Shop entity);

    int delete(final Long id, String updateTime);
}
