package com.ekart.customer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ekart.customer.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

List<Order> findByCustomerEmailId(String customerEmailId);

}
