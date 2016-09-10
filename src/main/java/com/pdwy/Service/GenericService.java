package com.pdwy.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by MaYunpeng on 2016/8/30.
 */
public interface GenericService <T, PK extends Serializable> {

    /**
     * 查询所有对象
     *
     * @return
     */
    List<T> listAll();

    /**
     * 获取单条数据
     *
     * @param id
     * @return
     */
    T get(final PK id);

    /**
     * 插入数据
     *
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 更新数据
     *
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除数据
     * @param id
     * @param updateTime
     * @return
     */
    int delete(final PK id, String updateTime);

}
