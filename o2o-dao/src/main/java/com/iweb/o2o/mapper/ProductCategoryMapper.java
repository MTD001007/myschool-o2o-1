package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.ProductCategory;
import java.util.List;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer productCategoryId);

    int insert(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer productCategoryId);

    List<ProductCategory> selectAll();

    int updateByPrimaryKey(ProductCategory record);
}