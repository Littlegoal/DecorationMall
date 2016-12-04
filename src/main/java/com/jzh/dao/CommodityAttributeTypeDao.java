package com.jzh.dao;

import com.jzh.model.CommodityAttributeType;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityAttributeTypeDao extends GenericDao<CommodityAttributeType,Long> {
    /**
     * ��ѯ���ж���
     *
     * @return
     */
    List<CommodityAttributeType> listAll();

    /**
     * ��ȡ��������
     *
     * @param id
     * @return
     */
    CommodityAttributeType get(final Long id);

    /**
     * ��������
     *
     * @param commodityAttributeType
     * @return
     */
    int insert(CommodityAttributeType commodityAttributeType);

    /**
     * ��������
     *
     * @param commodityAttributeType
     * @return
     */
    int update(CommodityAttributeType commodityAttributeType);

    /**
     * ɾ������
     * @param id
     * @param updateTime
     * @return
     */
    int delete(final Long id, String updateTime);
}
