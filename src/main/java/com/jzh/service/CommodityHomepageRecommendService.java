package com.jzh.service;

import com.jzh.dto.Goods;
import com.jzh.model.CommodityHomepageRecommend;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityHomepageRecommendService extends GenericService<CommodityHomepageRecommend,Long> {

    /**
     * 获取家具首页推荐商品信息集合
     * @return
     */
    List<Goods> getGoodsListForHomepageByTypeId(Long typeId);
}
