package com.ekart.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.ekart.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
