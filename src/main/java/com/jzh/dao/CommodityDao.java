package com.jzh.dao;
import com.jzh.model.Commodity;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityDao extends GenericDao<Commodity,Long>{

    /**
     * 通过三级分类里面的商品类型id来获取商品
     * @param typeId 商品类型id
     * @return
     */
    List<Commodity> getCommodityByType(Long typeId);

    /**
     * 通过店铺和商品类型获取商品
     * @param shopId 店铺id
     * @param typeId 类型id，为-1表示直接获取所有的店铺里面的所有商品
     * @return
     */
    List<Commodity> getCommodityByShopAndType(Long shopId,Long typeId);
}
