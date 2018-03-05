package com.aks.swagger.swaggerexample.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.aks.swagger.swaggerexample.domain.Product;

@RepositoryRestResource
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	Product findOneById(Integer id);
	//Optional<Product> findById(Integer id);

}