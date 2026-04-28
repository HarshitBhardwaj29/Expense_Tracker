package com.example.Expense.Tracker.service;

import com.example.Expense.Tracker.model.User;
import com.example.Expense.Tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public User registerUser(User user) {
        if (userRepo.existsByUsername(user.getUsername())) {
            throw new RuntimeException("Username already exists");
        }
        if (userRepo.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        return userRepo.save(user);
    }

    public User login(String username, String password) {
        User user = userRepo.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("Invalid username or password");
    }

    public String resetPassword(String email) {
        User user = userRepo.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("Email not found");
        }
        // Generate a temporary password (for simplicity, using 'temp1234')
        String tempPassword = "temp1234";
        user.setPassword(tempPassword);
        userRepo.save(user);
        return "Temporary password sent to your email: " + tempPassword;
    }

}
