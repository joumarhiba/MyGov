package com.mygov.Controller;

import com.mygov.Repository.TransactionRepository;
import com.mygov.models.Transaction;
import com.mygov.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.search.aggregations.metrics.InternalHDRPercentiles;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")

public class TransactionController {

    private final TransactionService transactionService;
    private final TransactionRepository transactionRepository;


    @PostMapping("/addTransaction")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.addTransaction(transaction);

    }

    @GetMapping("/getTransactions")
    public Iterable<Transaction> getTransactions() {
       return transactionService.getTransaction();
    }

    @GetMapping("/{ministere}")
    public Iterable<Transaction> getTransactionsByMinistere(@PathVariable String ministere) {
     Iterable<Transaction> transactions = transactionService.findByMinistere(ministere);
     return transactions;
    }
}
