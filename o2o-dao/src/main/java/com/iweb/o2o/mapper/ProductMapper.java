package com.iweb.o2o.mapper;

import com.iweb.o2o.entity.Extra;
import com.iweb.o2o.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    Product selectByPrimaryKey(Integer productId);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);

    List<Product> selectTop5(@Param("productCategoryId") Long productCategoryId,@Param("shopId") Long shopId);

    List<Product> selectProductByShopId(@Param("shopId") Long shopId);

    List<Extra> selectCountInGivenTime(@Param("shopId") Long shopId);

    List<Product> getProducts(Product product);
}