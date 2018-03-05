package com.aks.swagger.swaggerexample.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.aks.swagger.swaggerexample.domain.Product;

@RepositoryRestResource
@Repository
public interface ProductRepository extends CrudRepository<Product, String>{

	Product findOneById(String id);
	//Optional<Product> findById(Integer id);

}