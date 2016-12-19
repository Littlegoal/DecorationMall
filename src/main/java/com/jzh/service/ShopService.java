package com.jzh.service;

import com.jzh.dto.ShopInfo;
import com.jzh.model.Shop;

import java.util.List;

/**
 * @author Junhao Zhou 2016/11/16
 * @version 1.0
 */
public interface ShopService extends GenericService<Shop, Long> {

    /**
     * 根据店铺id获取店铺简介
     * @param shopId
     * @return
     */
    ShopInfo getShopInfoById(Long shopId);
}
