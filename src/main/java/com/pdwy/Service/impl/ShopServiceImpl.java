package com.pdwy.service.impl;

import com.pdwy.dao.GenericDao;
import com.pdwy.dao.ShopDao;
import com.pdwy.service.ShopService;
import com.pdwy.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MaYunpeng on 2016/8/30.
 */
@Service("shopService")
public class ShopServiceImpl extends GenericServiceImpl <Shop, Long> implements ShopService {

    @Autowired
    ShopDao shopDao;

    @Autowired
    public ShopServiceImpl(ShopDao shopDao) {
        super(shopDao);
        this.shopDao = shopDao;
    }

    @Override
    public List<Shop> listAll() {
        return shopDao.listAll();
    }

    @Override
    public Shop get(Long id) {
        return shopDao.get(id);
    }

    @Override
    public int insert(Shop entity) {
        return shopDao.insert(entity);
    }

    @Override
    public int update(Shop entity) {
        return shopDao.update(entity);
    }

    @Override
    public int delete(Shop entity) {
        return shopDao.delete(entity);
    }

}
