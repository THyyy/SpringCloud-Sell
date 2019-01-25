package com.example.order.controller;



import com.example.product.client.ProductClient;
import com.example.product.common.DecreaseStockInput;
import com.example.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author THY
 * @date 2018/12/4
 */
@RestController
@Slf4j
public class ClientController {

    @Autowired
    private ProductClient productClient;

    // @GetMapping("/getProductMsg")
    // public String getProductMsg() {
    //     String response = productClient.productMsg();
    //     log.info("response={}", response);
    //     return response;
    // }

    @GetMapping("/getProductList")
    public String getProductList() {
        List<ProductInfoOutput> productInfoList = productClient.listForOrder(Arrays.asList("157875196366160022", "157875227953464068", "164103465734242707"));
        log.info("response={}", productInfoList);
        return "ok";
    }

    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock() {
        productClient.decreaseStock(Arrays.asList(new DecreaseStockInput("164103465734242707",3)));
        return "成功";
    }
}
