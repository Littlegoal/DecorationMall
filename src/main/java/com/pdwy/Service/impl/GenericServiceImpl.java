package com.pdwy.service.impl;

import com.pdwy.service.GenericService;
import com.pdwy.dao.GenericDao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by MaYunpeng on 2016/8/30.
 */
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
    public T get(Long id) {
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
    public int delete(T entity) {
        return dao.delete(entity);
    }
}
