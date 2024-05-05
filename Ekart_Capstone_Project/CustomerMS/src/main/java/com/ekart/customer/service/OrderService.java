package com.ekart.customer.service;

import java.util.List;

import com.ekart.customer.dto.OrderDTO;
import com.ekart.customer.dto.OrderStatus;
import com.ekart.customer.dto.PaymentThrough;
import com.ekart.customer.exception.EKartCustomerException;

public interface OrderService {
	
	 Integer placeOrder(OrderDTO orderDTO) throws EKartCustomerException;
	 OrderDTO getOrderDetails (Integer orderId) throws EKartCustomerException;
	 List<OrderDTO> findOrdersByCustomerEmailId(String emailId) throws EKartCustomerException;
	 void updateOrderStatus( Integer orderId , OrderStatus orderStatus) throws EKartCustomerException;
	 void updatePaymentThrough( Integer orderId , PaymentThrough paymentThrough) throws EKartCustomerException;
	 
}
