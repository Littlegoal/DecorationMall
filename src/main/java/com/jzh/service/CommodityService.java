package com.jzh.service;

import com.jzh.dto.Category;
import com.jzh.model.Commodity;

import java.util.List;

/**
 * @author Yun
 * @version 1.0.
 */
public interface CommodityService extends GenericService<Commodity,Long>{

    /**
     * 根据商品id获取面包屑导航
     * @param commodityId
     * @return
     */
    List<Category> getBreadcrumbNavigationById(Long commodityId);
}
