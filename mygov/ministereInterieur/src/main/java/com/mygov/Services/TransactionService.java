package com.mygov.Services;

import com.mygov.models.Transaction;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {

    public Transaction addTransaction(Transaction transaction);
    }
