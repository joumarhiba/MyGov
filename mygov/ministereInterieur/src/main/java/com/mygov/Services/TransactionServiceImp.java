package com.mygov.Services;

import com.mygov.Repository.TransactionRepo;
import com.mygov.models.Admin;
import com.mygov.models.Transaction;
import com.thoughtworks.xstream.converters.time.LocalDateTimeConverter;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
@Primary

public class TransactionServiceImp implements TransactionService {

    private final TransactionRepo transactionRepo;

    @Override
    public Transaction addTransaction(Transaction transaction) {
        transaction.setDate(LocalDateTime.now());
        Transaction savedTransaction = transactionRepo.save(transaction);
        return savedTransaction;
    }
}
