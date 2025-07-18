package com.ecommerce.platform.product_service.service;

import com.ecommerce.platform.product_service.entity.Product;
import com.ecommerce.platform.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Long addProduct(Product product) {
        Product newProduct = new Product();
//        newProduct.setId(product.getId()); No need to set as it is auto incremented
        newProduct.setName(product.getName());
        System.out.println("msg----"+newProduct.getName());
        productRepository.save(newProduct);
        System.out.println("success");
        return newProduct.getId();
    }
}
