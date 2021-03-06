package com.jzh.dao;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface GenericDao <T, PK extends Serializable> {

    /**
     * 查询所有对象
     *
     * @return
     */
    List<T> listAll();

    /**
     * 查询所有未被删除的对象
     *
     * @return
     */
    List<T> listAllNoDeleted();

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
     * 根据某一字段多关键字和相关条件查询数据__网站
     * @param map
     * @return
     */
    List<T> searchPageForCustomerByConditions(Map<String,Object> map);

    /**
     * 根据某一字段多关键字和相关条件查询数据__后台管理系统
     * @param map
     * @return
     */
    List<T> searchPageForAdminByConditions(Map<String,Object> map);

}
