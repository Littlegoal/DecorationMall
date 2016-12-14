package com.jzh.dao;

import com.jzh.model.Worker;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface WorkerDao extends GenericDao<Worker,Long> {

    @Override
    List<Worker> listAll();

    @Override
    Worker get(final Long id);

    @Override
    int insert(Worker entity);

    @Override
    int update(Worker entity);

    @Override
    int delete(final Long id);

}
