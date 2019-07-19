package com.iweb.o2o.service.impl;


import com.iweb.o2o.entity.Shop;
import com.iweb.o2o.mapper.AreaMapper;
import com.iweb.o2o.mapper.ShopMapper;
import com.iweb.o2o.service.ShopService;
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
    private AreaMapper areaMapper;
    @Override
    public List<Shop> getAllShops() {
        return shopMapper.selectAll();
    }
    @Override
    public List<Shop> getTop5(){return shopMapper.selectTop5();}
    @Override
    public Map<String,Integer> getDistribution(){
        return shopMapper.selectDistribution();
    }


}
