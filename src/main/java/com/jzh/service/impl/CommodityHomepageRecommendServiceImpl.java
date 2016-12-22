package com.jzh.service.impl;

import com.jzh.dao.CommodityHomepageRecommendDao;
import com.jzh.dto.Goods;
import com.jzh.model.CommodityHomepageRecommend;
import com.jzh.service.CommodityHomepageRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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


    @Override
    public List<Goods> getGoodsListForHomepageByTypeId(Long typeId) {

        List<CommodityHomepageRecommend> commodityHomepageRecommends = commodityHomepageRecommendDao.getRecommendListByTypeId(typeId);
        List<Goods> goodsList = new ArrayList<>();

        for(CommodityHomepageRecommend commodityHomepageRecommend : commodityHomepageRecommends) {

            Goods goods = new Goods();
            goods.setId(commodityHomepageRecommend.getCommodityId());
            goods.setName(commodityHomepageRecommend.getCommodityName());
            goods.setDisplayImage(commodityHomepageRecommend.getCommodityImg());
            goods.setPrice(commodityHomepageRecommend.getCommodityPrice());
            goods.setSale(commodityHomepageRecommend.getIsSale());
            goods.setShopId(commodityHomepageRecommend.getShopId());
            goods.setShopName(commodityHomepageRecommend.getShopName());

            goodsList.add(goods);
        }

        return goodsList;
    }
}
