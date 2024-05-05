package com.ekart.payment.repository;



import org.springframework.data.repository.CrudRepository;

import com.ekart.payment.entity.Transaction;

public interface TransactionRepository   extends CrudRepository<Transaction, Integer> {

}
