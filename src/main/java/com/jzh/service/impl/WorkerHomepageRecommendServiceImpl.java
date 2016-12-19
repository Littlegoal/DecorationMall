package com.jzh.service.impl;

import com.jzh.dao.GenericDao;
import com.jzh.dao.WorkerHomepageRecommendDao;
import com.jzh.model.WorkerHomepageRecommend;
import com.jzh.service.WorkerHomepageRecommendService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hjy on 2016/12/15.
 */
public class WorkerHomepageRecommendServiceImpl extends GenericServiceImpl<WorkerHomepageRecommend, Long> implements WorkerHomepageRecommendService {

    @Autowired
    private WorkerHomepageRecommendDao workerHomepageRecommendDao;

    @Autowired

    public WorkerHomepageRecommendServiceImpl(WorkerHomepageRecommendDao workerHomepageRecommendDao) {
        super(workerHomepageRecommendDao);
        this.workerHomepageRecommendDao = workerHomepageRecommendDao;
    }
}
