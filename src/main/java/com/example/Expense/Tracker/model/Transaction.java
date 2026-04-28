package com.example.Expense.Tracker.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;

    private String text;

    private double amount;

    private LocalDate date;

    @DBRef
    @JsonBackReference
    private User user;

}
