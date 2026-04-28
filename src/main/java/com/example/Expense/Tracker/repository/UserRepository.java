package com.example.Expense.Tracker.repository;

import com.example.Expense.Tracker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    boolean existsByEmail(String email);
    boolean existsByUsername(String username);

    User findByUsername(String username);
    User findByEmail(String email);
}
