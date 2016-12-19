package com.jzh.service.impl;

import com.jzh.dao.CommodityDao;
import com.jzh.dao.CommodityTypeLevelThreeDao;
import com.jzh.dao.CommodityTypeLevelTwoDao;
import com.jzh.dto.Category;
import com.jzh.model.Commodity;
import com.jzh.model.CommodityTypeLevelThree;
import com.jzh.model.CommodityTypeLevelTwo;
import com.jzh.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Yun
 * @version 1.0.
 */
@Service("commodityService")
public class CommodityServiceImpl extends GenericServiceImpl<Commodity,Long> implements CommodityService{

    @Autowired
    CommodityDao commodityDao;
    @Autowired
    CommodityTypeLevelTwoDao commodityTypeLevelTwoDao;
    @Autowired
    CommodityTypeLevelThreeDao commodityTypeLevelThreeDao;

    @Autowired
    public CommodityServiceImpl(CommodityDao commodityDao){
        super(commodityDao);
        this.commodityDao = commodityDao;
    }

    @Override
    public List<Category> getBreadcrumbNavigationById(Long commodityId) {

        Commodity commodity = commodityDao.get(commodityId);
        Long commodityTypeLevelThreeId = commodity.getTypeId();
        CommodityTypeLevelThree commodityTypeLevelThree = commodityTypeLevelThreeDao.get(commodityTypeLevelThreeId);
        CommodityTypeLevelTwo commodityTypeLevelTwo = commodityTypeLevelTwoDao.get(commodityTypeLevelThree.getTypeLevelTwoId());

        List<Category> categories = new ArrayList<>();
        Category categoryTwo = new Category();
        categoryTwo.setId(commodityTypeLevelTwo.getTypeLevelTwoId());
        categoryTwo.setName(commodityTypeLevelTwo.getTypeLevelTwoName());
        categories.add(categoryTwo);

        Category categoryThree = new Category();
        categoryThree.setId(commodityTypeLevelThreeId);
        categoryThree.setName(commodityTypeLevelThree.getTypeLevelThreeName());
        categories.add(categoryThree);

        return categories;
    }
}
