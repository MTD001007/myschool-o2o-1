package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.LocalAuth;
import java.util.List;

public interface LocalAuthMapper {
    int deleteByPrimaryKey(Integer localAuthId);

    int insert(LocalAuth record);

    LocalAuth selectByPrimaryKey(Integer localAuthId);

    List<LocalAuth> selectAll();

    int updateByPrimaryKey(LocalAuth record);
}