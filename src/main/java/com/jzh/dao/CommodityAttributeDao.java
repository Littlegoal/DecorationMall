package com.jzh.dao;

import com.jzh.model.Commodity;
import com.jzh.model.CommodityAttribute;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityAttributeDao extends GenericDao<CommodityAttribute,Long> {
    /**
     *
     * @return
     */
    List<CommodityAttribute> listAll();

    /**
     * 获取单条数据
     * @param id 按照主键来查询单条数据
     * @return 主键为id的一条数据，没有返回null
     */
    CommodityAttribute get(final Long id);

    /**
     * 插入数据
     * @param commodity 需要插入商品对象
     * @return 返回插入的数据条数，掺入数据的自动增长id由{@code CommodityAttribute.id}来获取
     */
    int insert(Commodity commodity);

    /**
     * 更新数据
     *
     * @param commodityAttribute
     * @return
     */
    int update(CommodityAttribute commodityAttribute);

    /**
     * 删除数据
     * @param id
     * @param updateTime
     * @return
     */
    int delete(final Long id, String updateTime);
}
