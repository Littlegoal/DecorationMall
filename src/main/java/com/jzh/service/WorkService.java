package com.jzh.service;

import com.jzh.model.Work;

import java.util.List;

/**
 * Created by hjy on 2016/12/15.
 */
public interface WorkService extends GenericService<Work, Long> {

    List<Work> listAll();

    Work get(final Long id);

    int insert(Work entity);

    int update(Work entity);

    int delete(final Long id);
}
