package com.iweb.o2o.shop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iweb.o2o.entity.Extra;
import com.iweb.o2o.entity.Product;
import com.iweb.o2o.service.AreaService;
import com.iweb.o2o.service.ShopCategoryService;
import com.iweb.o2o.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author azzhu
 * @create 2019-07-19 15:37:15
 */
@Controller
@RequestMapping("/shop")
public class ShopAdminController {
    @Autowired
    private AreaService areaService;
    @Autowired
    private ShopCategoryService shopCategoryService;
    @Autowired
    private ShopService shopService;

    @GetMapping("/add.html")
    public ModelAndView toAdd() {
        //应该查询出地区列表放入域中
        ModelAndView mv = new ModelAndView();
        List areas = areaService.getAllAreas();
        mv.addObject("areas",areas);
        mv.setViewName("add.html");
        return mv;
    }

    @GetMapping("/categories")
    @ResponseBody
    public  Object getCategories(@RequestParam(required = false,name = "parentId") Long parentId){
        return shopCategoryService.getCategories(parentId);
    }

    @GetMapping("/statistics")
    public ModelAndView toStatistics() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("statistics.html");
        return mv;
    }
    @GetMapping("/getTop5Product")
    @ResponseBody
    public Map getTop5Product(/*Long productCategoryId, Long shopId*/){
        Map<String,Object> map = new HashMap<>();
        List<Product> products = shopService.getTop5Product(11L,20L);
        map.put("products",products);
        return map;
    }
    @GetMapping("/countInTimePeriod")
    @ResponseBody
    public Map counttTimePeriod(){
        Map<String,Object> map = new HashMap<>();
        List<Extra> extras = shopService.getCountInGivenTime(20L);
        map.put("extras",extras);
        return map;
    }

    @GetMapping("/productList.html")
    public ModelAndView getProductList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("productList.html");
        return mv;
    }
    @GetMapping("/productList.json")
    @ResponseBody
    public Object getProducts(@RequestParam("page")int page,
                              @RequestParam("limit")int limit) {
//        System.out.println("page:"+page+"limit:"+limit);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","ok");
        map.put("count",shopService.getAllProductsInShop(20L).size());
        map.put("data",shopService.getProductInShop(20L,page,limit));
//        PageHelper.offsetPage(page,limit);
//        List<Product> products = shopService.getAllProductInShop(20L);
//        PageInfo<Product> pageInfo = new PageInfo<>(products);
//        map.put("data",pageInfo);
        return map;
    }

/*    @GetMapping("/productListOld")
    @ResponseBody
    public ModelAndView getAllProductsInShop(){
        PageHelper.offsetPage(0,5);

        List<Product> products = shopService.getAllProductInShop(20L);
        PageInfo<Product> pageInfo = new PageInfo<>(products);
        ModelAndView mv = new ModelAndView();
        mv.addObject("products",pageInfo);
        mv.setViewName("productListOld.html");
        return mv;
    }*/

    @GetMapping("/shopmanage.html")
    public String shopManage() {
        return "shopmanage.html";
    }
}