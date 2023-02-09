package com.mygov.Services;

import com.mygov.common.TransactionRequest;
import com.mygov.common.TransactionResponse;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {

    public TransactionResponse addTransaction(TransactionRequest transactionRequest);
    }
