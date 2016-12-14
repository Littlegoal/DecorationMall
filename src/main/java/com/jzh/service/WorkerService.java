package com.jzh.service;

import com.github.pagehelper.PageInfo;
import com.jzh.model.Worker;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface WorkerService extends GenericService<Worker,Long> {

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
