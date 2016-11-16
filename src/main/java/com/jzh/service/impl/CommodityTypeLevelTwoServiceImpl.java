package com.jzh.service.impl;

import com.jzh.dao.CommodityTypeLevelTwoDao;
import com.jzh.model.CommodityTypeLevelTwo;
import com.jzh.service.CommodityTypeLevelTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Service("commodityTypeLevelTwoService")
public class CommodityTypeLevelTwoServiceImpl extends GenericServiceImpl<CommodityTypeLevelTwo,Long> implements CommodityTypeLevelTwoService{

    @Autowired
    private CommodityTypeLevelTwoDao commodityTypeLevelTwoDao;

    @Autowired
    public CommodityTypeLevelTwoServiceImpl(CommodityTypeLevelTwoDao commodityTypeLevelTwoDao) {
        super(commodityTypeLevelTwoDao);
        this.commodityTypeLevelTwoDao = commodityTypeLevelTwoDao;
    }
}
