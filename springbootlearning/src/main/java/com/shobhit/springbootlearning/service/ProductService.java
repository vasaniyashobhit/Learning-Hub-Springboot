package com.shobhit.springbootlearning.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public String getProduct(){
        return "Laptop -- from ProductService! ";
    }
}
