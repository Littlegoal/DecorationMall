package com.jzh.service;

import com.jzh.model.CommodityTypeLevelOne;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityTypeLevelOneService extends GenericService<CommodityTypeLevelOne,Long> {

    @Override
    List<CommodityTypeLevelOne> listAll();

    @Override
    CommodityTypeLevelOne get(final Long id);

    @Override
    int insert(CommodityTypeLevelOne entity);

    @Override
    int update(CommodityTypeLevelOne entity);

    @Override
    int delete(final Long id);
}
