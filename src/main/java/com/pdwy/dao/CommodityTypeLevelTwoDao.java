package com.pdwy.dao;

import com.pdwy.model.CommodityTypeLevelTwo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityTypeLevelTwoDao extends GenericDao<CommodityTypeLevelTwo,Long> {

    @Override
    List<CommodityTypeLevelTwo> listAll();

    @Override
    CommodityTypeLevelTwo get(final Long id);

    @Override
    int insert(CommodityTypeLevelTwo entity);

    @Override
    int update(CommodityTypeLevelTwo entity);

    @Override
    int delete(@Param("typeLevelTwoId")final Long id,@Param("updateTime") String updateTime);
}
