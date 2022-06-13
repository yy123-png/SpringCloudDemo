package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/order/create")
    public String createOrder(Integer productId,Integer userId) {
        String productName = restTemplate.getForObject("http://localhost:9000/product/" + productId, String.class);
        String userName = restTemplate.getForObject("http://localhost:10001/user/" + userId,String.class);
        return "用户:"+userName+"购买了商品:"+productName;
    }
}

