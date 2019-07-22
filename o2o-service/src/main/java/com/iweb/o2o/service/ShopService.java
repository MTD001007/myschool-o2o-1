package com.iweb.o2o.service;

import com.iweb.o2o.entity.Extra;
import com.iweb.o2o.entity.Product;
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

    List<Product> getTop5Product(Long productCategoryId, Long shopId);

    List<Product> getAllProductsInShop( Long shopId);
    List<Product> getProductInShop( Long shopId, int page, int limit);

    List<Extra> getCountInGivenTime(Long shopId);



}
