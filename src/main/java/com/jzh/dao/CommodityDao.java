package com.jzh.dao;
import com.jzh.model.Commodity;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityDao extends GenericDao<Commodity,Long>{

    /**
     * ��ѯ���ж���
     * @return �����������������
     */
    List<Commodity> listAll();

    /**
     * ��ȡ��������
     * @param id ������������ѯ��������
     * @return ����Ϊid��һ�����ݣ�û�з���null
     */
    Commodity get(final Long id);

    /**
     * ��������
     * @param commodity ��Ҫ������Ʒ����
     * @return ���ز���������������������ݵ��Զ�����id��{@code Commodity.id}����ȡ
     */
    int insert(Commodity commodity);

    /**
     * ��������
     *
     * @param commodity
     * @return
     */
    int update(Commodity commodity);

    /**
     * ɾ������
     * @param id
     * @param updateTime
     * @return
     */
    int delete(final Long id, String updateTime);

    /**
     * ͨ����Ʒid����ȡ��Ʒ��{@see get}
     * @param id ��Ʒid
     * @return
     */
    Commodity getCommodityById(Long id);

    /**
     * ͨ�����������������Ʒ����id����ȡ��Ʒ
     * @param typeId ��Ʒ����id
     * @return
     */
    List<Commodity> getCommodityByType(Long typeId);

    /**
     * ͨ�����̺���Ʒ���ͻ�ȡ��Ʒ
     * @param shopId ����id
     * @param typeId ����id��Ϊ-1��ʾֱ�ӻ�ȡ���еĵ��������������Ʒ
     * @return
     */
    List<Commodity> getCommodityByShopAndType(Long shopId,Long typeId);
}
