package com.ecommerce.platform.product_service.controller;

import com.ecommerce.platform.product_service.entity.Product;
import com.ecommerce.platform.product_service.repository.ProductRepository;
import com.ecommerce.platform.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
    Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    Long addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
}
