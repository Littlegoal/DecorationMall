package com.jzh.service;

import com.jzh.model.WorkerHomepageRecommend;

import java.util.List;

/**
 * Created by hjy on 2016/12/15.
 */
public interface WorkerHomepageRecommendService extends GenericService<WorkerHomepageRecommend, Long> {

    List<WorkerHomepageRecommend> listAll();

    WorkerHomepageRecommend get(final Long id);

    int insert(WorkerHomepageRecommend entity);

    int update(WorkerHomepageRecommend entity);

    int delete(final Long id);
}
