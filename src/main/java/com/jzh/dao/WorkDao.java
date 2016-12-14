package com.jzh.dao;

import com.jzh.model.Work;

import java.util.List;

/**
 * Created by hjy on 2016/12/13.
 */
public interface WorkDao extends GenericDao<Work,Long>  {

    List<Work> listAll();

    Work get(final Long id);

    int insert(Work entity);

    int update(Work entity);

    int delete(final Long id);
}
