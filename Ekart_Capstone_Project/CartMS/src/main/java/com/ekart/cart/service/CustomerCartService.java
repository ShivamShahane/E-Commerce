package com.ekart.cart.service;

import java.util.Set;

import com.ekart.cart.dto.CartProductDTO;
import com.ekart.cart.dto.CustomerCartDTO;
import com.ekart.cart.exception.EKartCustomerCartException;

public interface CustomerCartService {

	Integer addProductToCart(CustomerCartDTO customerCart) throws EKartCustomerCartException;
	Set<CartProductDTO> getProductsFromCart(String customerEmailId) throws EKartCustomerCartException;
	void modifyQuantityOfProductInCart(String customerEmailId, Integer productId ,Integer quantity) throws EKartCustomerCartException;
	void deleteProductFromCart(String customerEmailId,Integer productId) throws EKartCustomerCartException;
	void deleteAllProductsFromCart(String customerEmailId) throws EKartCustomerCartException;

}
