package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.Shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer shopId);

    int insert(Shop record);

    Shop selectByPrimaryKey(Integer shopId);

    List<Shop> selectAll();

    int updateByPrimaryKey(Shop record);

    List<Shop> selectTop5();


}