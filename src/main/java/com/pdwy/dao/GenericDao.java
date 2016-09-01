package com.pdwy.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by MaYunepng on 2016/8/30.
 */
public interface GenericDao <T, PK extends Serializable> {

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
    T get(final Long id);

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
     *
     * @param entity
     * @return
     */
    int delete(T entity);

}
