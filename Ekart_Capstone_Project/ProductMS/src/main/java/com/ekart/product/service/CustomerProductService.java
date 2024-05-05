package com.ekart.product.service;

import java.util.List;

import com.ekart.product.dto.ProductDTO;
import com.ekart.product.exception.EKartProductException;

public interface CustomerProductService {
	List<ProductDTO> getAllProducts() throws EKartProductException;
	
	ProductDTO getProductById(Integer productId) throws EKartProductException;
	
	
    void reduceAvailableQuantity(Integer productId, Integer quantity) throws EKartProductException ;
}
