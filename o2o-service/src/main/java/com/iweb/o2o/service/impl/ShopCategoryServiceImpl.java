package com.iweb.o2o.service.impl;

import com.iweb.o2o.entity.ProductCategory;
import com.iweb.o2o.entity.ShopCategory;
import com.iweb.o2o.mapper.ShopCategoryMapper;
import com.iweb.o2o.service.ShopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Autowired
    private ShopCategoryMapper shopCategoryMapper;
    @Override
    public List<ShopCategory> getCategories( Long parentId){
        return shopCategoryMapper.getCategories(parentId);

    }

}
