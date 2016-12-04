package com.jzh.service;

import com.jzh.model.Commodity;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityService extends GenericService<Commodity,Long>{

    /**
     * ��ѯ���ж���
     *
     * @return
     */
    @Override
    List<Commodity> listAll();

    /**
     * ��ȡ��������
     *
     * @param id
     * @return
     */
    @Override
    Commodity get(final Long id);

    /**
     * ��������
     *
     * @param commodity
     * @return
     */
    @Override
    int insert(Commodity commodity);

    /**
     * ��������
     *
     * @param commodity
     * @return
     */
    @Override
    int update(Commodity commodity);

    /**
     * ɾ������
     * @param id
     * @return
     */
    @Override
    int delete(final Long id);
}
