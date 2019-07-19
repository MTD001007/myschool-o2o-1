package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.PersonInfo;
import java.util.List;

public interface PersonInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(PersonInfo record);

    PersonInfo selectByPrimaryKey(Integer userId);

    List<PersonInfo> selectAll();

    int updateByPrimaryKey(PersonInfo record);
}