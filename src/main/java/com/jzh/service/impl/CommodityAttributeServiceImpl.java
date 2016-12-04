package com.jzh.service.impl;

import com.jzh.dao.CommodityAttributeDao;
import com.jzh.model.CommodityAttribute;
import com.jzh.service.CommodityAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Service("commodityAttributeService")
public class CommodityAttributeServiceImpl extends GenericServiceImpl<CommodityAttribute,Long> implements CommodityAttributeService {

    @Autowired
    CommodityAttributeDao commodityAttributeDao;

    @Autowired
    public CommodityAttributeServiceImpl(CommodityAttributeDao commodityAttributeDao) {
        super(commodityAttributeDao);
        this.commodityAttributeDao = commodityAttributeDao;
    }
}
