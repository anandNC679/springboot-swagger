package com.aks.swagger.swaggerexample.services;

import com.aks.swagger.swaggerexample.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(String id);

    Product saveProduct(Product product);

    void deleteProduct(String id);
}