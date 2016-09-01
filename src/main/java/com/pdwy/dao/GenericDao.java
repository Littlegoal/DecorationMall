package com.pdwy.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by MaYunepng on 2016/8/30.
 */
public interface GenericDao <T, PK extends Serializable> {

    /**
     * ��ѯ���ж���
     *
     * @return
     */
    List<T> listAll();

    /**
     * ��ȡ��������
     *
     * @param id
     * @return
     */
    T get(final Long id);

    /**
     * ��������
     *
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * ��������
     *
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * ɾ������
     *
     * @param entity
     * @return
     */
    int delete(T entity);

}
