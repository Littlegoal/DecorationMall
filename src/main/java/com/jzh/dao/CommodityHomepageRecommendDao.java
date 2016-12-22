package com.jzh.dao;

import com.jzh.model.CommodityHomepageRecommend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityHomepageRecommendDao extends GenericDao<CommodityHomepageRecommend,Long> {

    /**
     * 根据商品类型id获取首页推荐商品集合
     *
     * @return
     */
    List<CommodityHomepageRecommend> getRecommendListByTypeId(@Param("id")Long typeId);
}
