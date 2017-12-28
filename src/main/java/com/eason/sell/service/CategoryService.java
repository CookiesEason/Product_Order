package com.eason.sell.service;

import com.eason.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author CookiesEason
 * 2017/12/28 23:03
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
