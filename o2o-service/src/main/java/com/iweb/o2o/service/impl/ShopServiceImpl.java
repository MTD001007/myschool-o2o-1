package com.iweb.o2o.service.impl;


import com.github.pagehelper.PageHelper;
import com.iweb.o2o.entity.Extra;
import com.iweb.o2o.entity.Product;
import com.iweb.o2o.entity.Shop;
import com.iweb.o2o.mapper.AreaMapper;
import com.iweb.o2o.mapper.ProductMapper;
import com.iweb.o2o.mapper.ShopMapper;
import com.iweb.o2o.service.ShopService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author azzhu
 * @create 2019-07-18 14:12:24
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Shop> getAllShops() {
        return shopMapper.selectAll();
    }
    @Override
    public List<Shop> getTop5(){return shopMapper.selectTop5();}
    @Override
    public List<Product> getTop5Product(Long productCategoryId, Long shopId){
        return productMapper.selectTop5(productCategoryId,shopId);
    }
    @Override
    public List<Product> getAllProductsInShop(Long shopId){
        return productMapper.selectAllProductsByShopId(shopId);
    }
    @Override
    public List<Product> getProductInShop( Long shopId,int page, int limit){
        //也可以在这里调pageHelper,写方法，或者封装pageBean。
        return productMapper.selectProductByShopId(shopId,page,limit);
    }
    @Override
    public List<Extra> getCountInGivenTime(Long shopId){
        return productMapper.selectCountInGivenTime(shopId);
    }



}
