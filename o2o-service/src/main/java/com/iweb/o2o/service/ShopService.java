package com.iweb.o2o.service;

import com.iweb.o2o.entity.Shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author azzhu
 * @create 2019-07-18 14:11:44
 */
public interface ShopService {

    /**
     * 返所有地区
     * @return
     */
    List<Shop> getAllShops();

    List<Shop> getTop5();





}
