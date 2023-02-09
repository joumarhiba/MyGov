package com.mygov.Controller;

import com.mygov.Repository.TransactionRepository;
import com.mygov.models.Transaction;
import com.mygov.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")

public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping("/addTransaction")
    public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction) {
        Transaction newTransaction = transactionService.addTransaction(transaction);
        return new ResponseEntity<Transaction>(newTransaction, HttpStatus.CREATED);
    }

    @GetMapping("/getTransactions")
    public Iterable<Transaction> getTransactions() {
       Iterable<Transaction> transactions = transactionService.getTransaction();
       return transactions;
    }
}
