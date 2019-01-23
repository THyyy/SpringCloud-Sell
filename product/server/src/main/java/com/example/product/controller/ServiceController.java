package com.example.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author THY
 * @date 2018/12/4
 */
@RestController
public class ServiceController {

    @GetMapping("/message")
    public String msg() {
        return "this is a product server 1";

    }
}
