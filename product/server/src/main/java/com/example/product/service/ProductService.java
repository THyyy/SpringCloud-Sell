package com.example.product.service;

import com.example.product.common.DecreaseStockInput;
import com.example.product.dto.CartDTO;
import com.example.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author THY
 * @date 2018/12/1
 */
public interface ProductService {
    /**
     * 查询所有在架商品信息
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
