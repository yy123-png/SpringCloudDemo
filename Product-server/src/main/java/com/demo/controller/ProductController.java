package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product/{productId}")
    public String getProductName(@PathVariable("productId") Integer productId) {
        return "iphone 13";
    }
}
