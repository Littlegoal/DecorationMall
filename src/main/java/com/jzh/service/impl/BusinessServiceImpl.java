package com.jzh.service.impl;

import com.jzh.dao.BusinessDao;
import com.jzh.model.Business;
import com.jzh.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Junhao Zhou 2016/11/25
 * @version 1.0
 */
@Service("BusinessService")
public class BusinessServiceImpl extends GenericServiceImpl<Business, Long>
        implements BusinessService {

    @Autowired
    private BusinessDao businessDao;

    @Autowired
    public BusinessServiceImpl(BusinessDao<Business, Long> businessDao) {
        super(businessDao);
        this.businessDao = businessDao;
    }
}
