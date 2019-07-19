package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.HeadLine;
import java.util.List;

public interface HeadLineMapper {
    int deleteByPrimaryKey(Integer lineId);

    int insert(HeadLine record);

    HeadLine selectByPrimaryKey(Integer lineId);

    List<HeadLine> selectAll();

    int updateByPrimaryKey(HeadLine record);
}