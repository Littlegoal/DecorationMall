package com.jzh.service;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Yunpeng Ma
 * @version 1.0
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
     * @return
     */
    int delete(final PK id);

    /**
     * 根据某一字段多关键字和相关条件分页查询数据__网站
     * @param pageNum
     * @param pageSize
     * @param map
     * @return
     */
    PageInfo<T> searchPageForCustomerByConditions(int pageNum, int pageSize,Map<String,Object> map);

    /**
     * 根据某一字段多关键字和相关条件分页查询数据__后台管理系统
     * @param pageNum
     * @param pageSize
     * @param map
     * @return
     */
    PageInfo<T> searchPageForAdminByConditions(int pageNum, int pageSize,Map<String,Object> map);
}
