package com.ekart.cart.repository;



import org.springframework.data.repository.CrudRepository;

import com.ekart.cart.entity.CartProduct;


public interface CartProductRepository extends CrudRepository<CartProduct, Integer> {

}
