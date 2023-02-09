package com.mygov.common;

import com.mygov.models.Transaction;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionRequest {
    private Transaction transactionInterieur;
    private TransactionEF transactionEF;
    private LocalDateTime date;
}
