package com.jzh.service.impl;

import com.jzh.dao.CommodityDao;
import com.jzh.model.Commodity;
import com.jzh.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Yun
 * @version 1.0.
 */
@Service("commodityService")
public class CommodityServiceImpl extends GenericServiceImpl<Commodity,Long> implements CommodityService{

    @Autowired
    CommodityDao commodityDao;

    @Autowired
    public CommodityServiceImpl(CommodityDao commodityDao){
        super(commodityDao);
        this.commodityDao = commodityDao;
    }


}
