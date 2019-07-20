package com.iweb.o2o.service;

import com.iweb.o2o.entity.ShopCategory;


import java.util.List;

public interface ShopCategoryService {
    List<ShopCategory> getCategories( Long parentId);

}
