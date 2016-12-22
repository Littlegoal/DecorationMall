package com.jzh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jzh.service.GenericService;
import com.jzh.dao.GenericDao;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Service("genericService")
public class GenericServiceImpl<T, PK extends Serializable> implements GenericService <T, PK> {

    protected  GenericDao <T, PK> dao;

    public GenericServiceImpl() {

    }

    public GenericServiceImpl(GenericDao<T, PK> genericDao) {
        this.dao = genericDao;
    }

    @Override
    public List<T> listAll() {
        return dao.listAll();
    }

    @Override
    public T get(PK id) {
        return dao.get(id);
    }

    @Override
    public int insert(T entity) {
        return dao.insert(entity);
    }

    @Override
    public int update(T entity) {
        return dao.update(entity);
    }

    @Override
    public int delete(PK id) {
        return dao.delete(id);
    }

    @Override
    public PageInfo<T> searchPageForCustomerByConditions(int pageNum, int pageSize, Map<String,Object> map) {
        PageHelper.startPage(pageNum,pageSize);
        List<T> list = dao.searchPageForCustomerByConditions(map);
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<T> searchPageForAdminByConditions(int pageNum, int pageSize, Map<String, Object> map) {
        PageHelper.startPage(pageNum,pageSize);
        List<T> list = dao.searchPageForAdminByConditions(map);
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        return pageInfo;
    }
}
