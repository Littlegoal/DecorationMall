package com.pdwy.dao;

import com.pdwy.model.CommodityHomepageRecommend;

import java.util.List;

/**
 * @author MaYunpeng
 * @version 1.0
 */
public interface CommodityHomepageRecommendDao extends GenericDao<CommodityHomepageRecommend,Long> {

    @Override
    List<CommodityHomepageRecommend> listAll();

    @Override
    CommodityHomepageRecommend get(final Long id);

    @Override
    int insert(CommodityHomepageRecommend entity);

    @Override
    int update(CommodityHomepageRecommend entity);

    @Override
    int delete(final Long id, String updateTime);
}
