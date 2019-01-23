package com.example.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @author THY
 * @date 2018/12/18
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystraixController {

   //超时配置
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    @GetMapping("/getProductInfoList")
    // @HystrixCommand(commandProperties = {
    //         @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//设置熔断
    //         @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求数达到最小的10次
    //         @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//设置10秒的时间窗
    //         @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")//断路器的最小比例数，当超过60%时打开断路器
    // })
    public String getProductInfoList() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://localhost:8083/product/listForOrder",
                Arrays.asList("157875196366160022"),
                String.class);
    }

    private String fallback() {
        return "太拥挤了，请稍后再试~~";
    }

    private String defaultFallback() {
        return "默认太拥挤了，请稍后再试~~";
    }
}
