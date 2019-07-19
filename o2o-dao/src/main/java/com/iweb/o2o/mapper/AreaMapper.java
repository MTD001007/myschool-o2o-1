package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.Area;
import java.util.List;
import java.util.Map;

public interface AreaMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(Area record);

    Area selectByPrimaryKey(Integer areaId);

    List<Area> selectAll();

    int updateByPrimaryKey(Area record);

    List<Area> selectDistribution();
}
