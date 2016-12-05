package com.jzh.dao;

import com.jzh.model.CommodityAttributeType;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityAttributeTypeDao extends GenericDao<CommodityAttributeType,Long> {
    /**
     * 查询所有对象
     *
     * @return
     */
    List<CommodityAttributeType> listAll();

    /**
     * 获取单条数据
     *
     * @param id
     * @return
     */
    CommodityAttributeType get(final Long id);

    /**
     * 插入数据
     *
     * @param commodityAttributeType
     * @return
     */
    int insert(CommodityAttributeType commodityAttributeType);

    /**
     * 更新数据
     *
     * @param commodityAttributeType
     * @return
     */
    int update(CommodityAttributeType commodityAttributeType);

    /**
     * 删除数据
     * @param id
     * @param updateTime
     * @return
     */
    int delete(final Long id, String updateTime);
}
