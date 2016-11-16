package com.jzh.service.impl;

import com.jzh.dao.CommodityTypeLevelOneDao;
import com.jzh.model.CommodityTypeLevelOne;
import com.jzh.service.CommodityTypeLevelOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Service("commodityTypeLevelOneService")
public class CommodityTypeLevelOneServiceImpl  extends GenericServiceImpl<CommodityTypeLevelOne,Long> implements CommodityTypeLevelOneService {

    @Autowired
    private CommodityTypeLevelOneDao commodityTypeLevelOneDao;

    @Autowired
    public CommodityTypeLevelOneServiceImpl(CommodityTypeLevelOneDao commodityTypeLevelOneDao) {
        super(commodityTypeLevelOneDao);
        this.commodityTypeLevelOneDao = commodityTypeLevelOneDao;
    }

}
