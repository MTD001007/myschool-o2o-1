package com.iweb.o2o.service;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.iweb.o2o.entity.Area;
import org.springframework.boot.json.JsonParseException;

import java.io.IOException;
import java.util.List;

/**
 * @author azzhu
 * @create 2019-07-18 14:11:44
 */
public interface AreaService {

    /**
     * 返所有地区
     * @return
     */
    List<Area> getAllAreas();



}
