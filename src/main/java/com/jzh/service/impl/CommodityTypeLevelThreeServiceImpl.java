package com.jzh.service.impl;

import com.jzh.dao.CommodityTypeLevelThreeDao;
import com.jzh.dto.Category;
import com.jzh.model.CommodityTypeLevelThree;
import com.jzh.service.CommodityTypeLevelThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Category> getCategoryListByCommodityTypes(String commodityTypes) {
        String[] idList = commodityTypes.split(",");
        CommodityTypeLevelThree commodityTypeLevelThree;
        List<Category> categories = new ArrayList<>();

        for(String typeLevelThreeId : idList) {
            commodityTypeLevelThree = commodityTypeLevelThreeDao.get(Long.parseLong(typeLevelThreeId));
            Category category = new Category();
            category.setName(commodityTypeLevelThree.getTypeLevelThreeName());
            category.setId(commodityTypeLevelThree.getTypeLevelThreeId());
            categories.add(category);
        }

        return categories;
    }
}
