package com.shobhit.springbootlearning.controller;


import com.shobhit.springbootlearning.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
        System.out.println("ProductController created with Constructor Injection! ");
    }

    @GetMapping("/get")
    public String getProduct(){
        return productService.getProduct();
    }
}
