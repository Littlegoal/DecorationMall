package com.jzh.service;

import com.jzh.model.CommodityAttributeType;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityAttributeTypeService extends GenericService<CommodityAttributeType,Long> {

    @Override
    List<CommodityAttributeType> listAll();

    @Override
    CommodityAttributeType get(final Long id);

    @Override
    int insert(CommodityAttributeType entity);

    @Override
    int update(CommodityAttributeType entity);

    @Override
    int delete(final Long id);
}
