package com.jzh.service.impl;

import com.jzh.dao.CommodityTypeLevelThreeDao;
import com.jzh.dao.ShopDao;
import com.jzh.dto.ShopInfo;
import com.jzh.model.Shop;
import com.jzh.service.CommodityTypeLevelThreeService;
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
    private CommodityTypeLevelThreeService commodityTypeLevelThreeService;

    @Autowired
    public ShopServiceImpl(ShopDao shopDao) {
        super(shopDao);
        this.shopDao = shopDao;
    }

    @Override
    public ShopInfo getShopInfoById(Long shopId) {

        Shop shop = shopDao.get(shopId);
        ShopInfo shopInfo = new ShopInfo();

        shopInfo.setId(shopId);
        shopInfo.setName(shop.getName());
        shopInfo.setAddress(shop.getAddress());
        shopInfo.setContact(shop.getContact());
        shopInfo.setDisplayImage(shop.getDisplayImage());
        shopInfo.setCategory(commodityTypeLevelThreeService.getCategoryListByCommodityTypes(shop.getCommodityTypes()));

        return shopInfo;
    }
}
