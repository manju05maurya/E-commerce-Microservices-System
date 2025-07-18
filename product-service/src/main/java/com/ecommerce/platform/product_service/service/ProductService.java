package com.ecommerce.platform.product_service.service;

import com.ecommerce.platform.product_service.entity.Product;
import org.springframework.stereotype.Service;


public interface ProductService {
Product getProductById(Long id);

    Long addProduct(Product product);
}
