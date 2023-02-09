package com.mygov.services;

import com.mygov.models.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {

    public Transaction addTransaction(Transaction transaction);
    public Iterable<Transaction> getTransaction();
    }
