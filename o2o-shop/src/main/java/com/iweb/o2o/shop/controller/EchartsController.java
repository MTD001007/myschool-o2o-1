package com.iweb.o2o.shop.controller;

import com.iweb.o2o.entity.Area;
import com.iweb.o2o.entity.Shop;
import com.iweb.o2o.service.AreaService;
import com.iweb.o2o.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author azzhu
 * @create 2019-07-19 10:34:41
 */
@Controller
@RequestMapping("/shop")
public class EchartsController {

    @Autowired
    private AreaService areaService;
    @Autowired
    private ShopService shopService;

    @GetMapping("/echarts")
    public ModelAndView toEcharts() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("echarts.html");
        return mv;
    }

    @GetMapping("/getData")
    @ResponseBody
    public Map getData() {
        Map<String,Object> map = new HashMap<>();
        List<Area> areas = areaService.getAllAreas();
        map.put("areas",areas);
        return map;
    }
    @GetMapping("/getTop5")
    @ResponseBody
    public Map getTop5() {
        Map<String,Object> map = new HashMap<>();
        List<Shop> shops = shopService.getTop5();
        map.put("shops",shops);
        return map;
    }
    @GetMapping("/getDistribution")
    @ResponseBody
    public Map getDistribution(){
        Map<String,Object> map = new HashMap<>();
        List<Area> areas2 = areaService.getDistribution();
        map.put("areas2",areas2);
        return map;
    }

}
