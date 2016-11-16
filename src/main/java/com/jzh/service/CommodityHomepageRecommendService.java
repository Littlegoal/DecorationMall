package com.jzh.service;

import com.jzh.model.CommodityHomepageRecommend;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityHomepageRecommendService extends GenericService<CommodityHomepageRecommend,Long> {

    @Override
    List<CommodityHomepageRecommend> listAll();

    @Override
    CommodityHomepageRecommend get(final Long id);

    @Override
    int insert(CommodityHomepageRecommend entity);

    @Override
    int update(CommodityHomepageRecommend entity);

    @Override
    int delete(final Long id);
}
