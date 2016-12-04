package com.jzh.dao;

import com.jzh.model.Commodity;
import com.jzh.model.CommodityAttribute;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityAttributeDao extends GenericDao<CommodityAttribute,Long> {
    /**
     *
     * @return
     */
    List<CommodityAttribute> listAll();

    /**
     * ��ȡ��������
     * @param id ������������ѯ��������
     * @return ����Ϊid��һ�����ݣ�û�з���null
     */
    CommodityAttribute get(final Long id);

    /**
     * ��������
     * @param commodity ��Ҫ������Ʒ����
     * @return ���ز���������������������ݵ��Զ�����id��{@code CommodityAttribute.id}����ȡ
     */
    int insert(Commodity commodity);

    /**
     * ��������
     *
     * @param commodityAttribute
     * @return
     */
    int update(CommodityAttribute commodityAttribute);

    /**
     * ɾ������
     * @param id
     * @param updateTime
     * @return
     */
    int delete(final Long id, String updateTime);
}
