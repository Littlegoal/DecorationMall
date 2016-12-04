package com.jzh.service.impl;

import com.jzh.dao.CommodityAttributeTypeDao;
import com.jzh.model.CommodityAttributeType;
import com.jzh.service.CommodityAttributeService;
import com.jzh.service.CommodityAttributeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Service("commodityAttributeTypeService")
public class CommodityAttributeTypeServiceImpl extends GenericServiceImpl<CommodityAttributeType,Long> implements CommodityAttributeTypeService {

    @Autowired
    private CommodityAttributeTypeDao commodityAttributeTypeDao;

    @Autowired
    public CommodityAttributeTypeServiceImpl(CommodityAttributeTypeDao commodityAttributeTypeDao) {
        super(commodityAttributeTypeDao);
        this.commodityAttributeTypeDao = commodityAttributeTypeDao;
    }
}
