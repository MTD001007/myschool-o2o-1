package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.ShopCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCategoryMapper {
    int deleteByPrimaryKey(Integer shopCategoryId);

    int insert(ShopCategory record);

    ShopCategory selectByPrimaryKey(Integer shopCategoryId);

    List<ShopCategory> selectAll();

    int updateByPrimaryKey(ShopCategory record);

    public List<ShopCategory> getCategories(@Param("parentId") Long parentId);
}