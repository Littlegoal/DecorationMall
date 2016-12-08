package com.jzh.dao;
import com.jzh.model.Commodity;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityDao extends GenericDao<Commodity,Long>{

    /**
     * 查询所有对象
     * @return 单表里面的所有数据
     */
    List<Commodity> listAll();

    /**
     * 获取单条数据
     * @param id 按照主键来查询单条数据
     * @return 主键为id的一条数据，没有返回null
     */
    Commodity get(final Long id);

    /**
     * 插入数据
     * @param commodity 需要插入商品对象
     * @return 返回插入的数据条数，掺入数据的自动增长id由{@code Commodity.id}来获取
     */
    int insert(Commodity commodity);

    /**
     * 更新数据
     *
     * @param commodity
     * @return
     */
    int update(Commodity commodity);

    /**
     * 删除数据
     * @param id
     * @param updateTime
     * @return
     */
    int delete(final Long id, String updateTime);

    /**
     * 通过商品id来获取商品，{@see get}
     * @param id 商品id
     * @return
     */
    Commodity getCommodityById(Long id);

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
