package com.jzh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jzh.dao.WorkerDao;
import com.jzh.model.Worker;
import com.jzh.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Service("workerService")
public class WorkerServiceImpl extends GenericServiceImpl<Worker,Long> implements WorkerService{

    @Autowired
    private WorkerDao workerDao;

    @Autowired
    public WorkerServiceImpl(WorkerDao workerDao) {
        super(workerDao);
        this.workerDao = workerDao;
    }
}
