package com.pdwy.dao;

import com.pdwy.model.CommodityTypeLevelOne;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityTypeLevelOneDao extends GenericDao<CommodityTypeLevelOne ,Long> {

    @Override
    List<CommodityTypeLevelOne> listAll();

    @Override
    CommodityTypeLevelOne get(final Long id);

    @Override
    int insert(CommodityTypeLevelOne entity);

    @Override
    int update(CommodityTypeLevelOne entity);

    @Override
    int delete(final Long id, String updateTime);
}
