package com.example.Expense.Tracker.repository;

import com.example.Expense.Tracker.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findByUserUsername(String username);
    Transaction findByIdAndUserUsername(String id, String username);
}
