package com.jzh.service.impl;

import com.jzh.dao.CommodityTypeLevelThreeDao;
import com.jzh.model.CommodityTypeLevelThree;
import com.jzh.service.CommodityTypeLevelThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Service("commodityTypeLevelThreeService")
public class CommodityTypeLevelThreeServiceImpl extends GenericServiceImpl<CommodityTypeLevelThree,Long> implements CommodityTypeLevelThreeService {

    @Autowired
    private CommodityTypeLevelThreeDao commodityTypeLevelThreeDao;

    @Autowired
    public CommodityTypeLevelThreeServiceImpl(CommodityTypeLevelThreeDao commodityTypeLevelThreeDao) {
        super(commodityTypeLevelThreeDao);
        this.commodityTypeLevelThreeDao = commodityTypeLevelThreeDao;
    }
}
