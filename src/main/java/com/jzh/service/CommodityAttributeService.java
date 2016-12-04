package com.jzh.service;

import com.jzh.model.CommodityAttribute;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityAttributeService extends GenericService<CommodityAttribute,Long> {

    @Override
    List<CommodityAttribute> listAll();

    @Override
    CommodityAttribute get(final Long id);

    @Override
    int insert(CommodityAttribute entity);

    @Override
    int update(CommodityAttribute entity);

    @Override
    int delete(final Long id);
}
