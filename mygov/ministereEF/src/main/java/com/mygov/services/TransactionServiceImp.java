package com.mygov.services;

import com.mygov.Repository.TransactionRepository;
import com.mygov.models.Transaction;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@Service
@Slf4j
public class TransactionServiceImp implements TransactionService{

    private final TransactionRepository transactionRepository;

    @Override
    public Transaction addTransaction(Transaction transaction) {
         transactionRepository.save(transaction);
         return  transaction;
    }

    @Override
    public Iterable<Transaction> getTransaction() {
        return transactionRepository.findAll();
    }

    @Override
    public Iterable<Transaction> findByMinistere(String ministere) {
       return transactionRepository.findByMinistere(ministere);
    }

    public String transactionProcessing() {
        //gateway
        return new Random().nextBoolean()?"succeeess":"faiiiiled";
    }
}
