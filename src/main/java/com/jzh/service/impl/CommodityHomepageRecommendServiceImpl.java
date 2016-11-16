package com.jzh.service.impl;

import com.jzh.dao.CommodityHomepageRecommendDao;
import com.jzh.model.CommodityHomepageRecommend;
import com.jzh.service.CommodityHomepageRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Service("commodityHomepageRecommendService")
public class CommodityHomepageRecommendServiceImpl extends GenericServiceImpl<CommodityHomepageRecommend,Long> implements CommodityHomepageRecommendService {

    @Autowired
    private CommodityHomepageRecommendDao commodityHomepageRecommendDao;

    @Autowired
    public CommodityHomepageRecommendServiceImpl(CommodityHomepageRecommendDao commodityHomepageRecommendDao) {
        super(commodityHomepageRecommendDao);
        this.commodityHomepageRecommendDao = commodityHomepageRecommendDao;
    }
}
