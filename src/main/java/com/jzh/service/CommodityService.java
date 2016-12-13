package com.jzh.service;

import com.jzh.model.Commodity;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityService extends GenericService<Commodity,Long>{

    /**
     * 查询所有对象
     *
     * @return
     */
    @Override
    List<Commodity> listAll();

    /**
     * 获取单条数据
     *
     * @param id
     * @return
     */
    @Override
    Commodity get(final Long id);

    /**
     * 插入数据
     *
     * @param commodity
     * @return
     */
    @Override
    int insert(Commodity commodity);

    /**
     * 更新数据
     *
     * @param commodity
     * @return
     */
    @Override
    int update(Commodity commodity);

    /**
     * 删除数据
     * @param id
     * @return
     */
    @Override
    int delete(final Long id);
}
