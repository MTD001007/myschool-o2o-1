package com.iweb.o2o.service.impl;


import com.iweb.o2o.entity.Area;
import com.iweb.o2o.mapper.AreaMapper;
import com.iweb.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import java.util.List;

/**
 * @author azzhu
 * @create 2019-07-18 14:12:24
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper  areaMapper;
    @Override
    public List<Area> getAllAreas() {
        return areaMapper.selectAll();
    }
    @Override
    public List<Area> getDistribution(){
        return areaMapper.selectDistribution();
    }

}
