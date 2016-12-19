package com.jzh.service.impl;

import com.jzh.dao.GenericDao;
import com.jzh.dao.WorkDao;
import com.jzh.model.Work;
import com.jzh.service.WorkService;
import com.jzh.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hjy on 2016/12/15.
 */

@Service("workservice")
public class WorkServiceImpl extends GenericServiceImpl<Work, Long> implements WorkService {

    @Autowired
    private WorkDao workDao;

    @Autowired
    public WorkServiceImpl(WorkDao workDao) {
        super(workDao);
        this.workDao = workDao;
    }
}
