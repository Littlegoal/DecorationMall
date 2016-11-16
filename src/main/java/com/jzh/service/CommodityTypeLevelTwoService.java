package com.jzh.service;

import com.jzh.model.CommodityTypeLevelTwo;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityTypeLevelTwoService extends GenericService<CommodityTypeLevelTwo,Long> {

    @Override
    List<CommodityTypeLevelTwo> listAll();

    @Override
    CommodityTypeLevelTwo get(final Long id);

    @Override
    int insert(CommodityTypeLevelTwo entity);

    @Override
    int update(CommodityTypeLevelTwo entity);

    @Override
    int delete(final Long id);
}
