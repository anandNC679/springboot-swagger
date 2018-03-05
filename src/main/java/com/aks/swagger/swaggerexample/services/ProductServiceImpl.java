package com.aks.swagger.swaggerexample.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aks.swagger.swaggerexample.domain.Product;
import com.aks.swagger.swaggerexample.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        logger.debug("listAllProducts called");
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        logger.debug("getProductById called");
        //System.out.println(productRepository.findById(id));
        Product p=productRepository.findOneById(id);
        return p;
    }

    @Override
    public Product saveProduct(Product product) {
        logger.debug("saveProduct called");
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        logger.debug("deleteProduct called");
        productRepository.deleteById(id);
    }
}