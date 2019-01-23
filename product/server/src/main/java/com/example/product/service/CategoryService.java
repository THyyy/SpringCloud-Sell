package com.example.product.service;

import com.example.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * @author THY
 * @date 2018/12/1
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
