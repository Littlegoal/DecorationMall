package com.jzh.dao;

import com.jzh.model.CommodityTypeLevelOne;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityTypeLevelOneDao extends GenericDao<CommodityTypeLevelOne ,Long> {

    @Override
    List<CommodityTypeLevelOne> listAll();

    @Override
    CommodityTypeLevelOne get(@Param("typeLevelOneId")final Long id);

    @Override
    int insert(CommodityTypeLevelOne entity);

    @Override
    int update(CommodityTypeLevelOne entity);

    @Override
    int delete(@Param("typeLevelOneId")final Long id);
}
