package com.jzh.service.impl;

import com.jzh.dao.ShopDao;
import com.jzh.model.Shop;
import com.jzh.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Junhao Zhou 2016/11/25
 * @version 1.0
 */
@Service("ShopService")
public class ShopServiceImpl extends GenericServiceImpl<Shop, Long>
        implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Autowired
    public ShopServiceImpl(ShopDao shopDao) {
        super(shopDao);
        this.shopDao = shopDao;
    }
}
