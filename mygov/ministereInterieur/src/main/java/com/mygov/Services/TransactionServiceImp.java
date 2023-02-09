package com.mygov.Services;

import com.mygov.Repository.TransactionRepo;
import com.mygov.common.TransactionEF;
import com.mygov.common.TransactionRequest;
import com.mygov.common.TransactionResponse;
import com.mygov.models.Transaction;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
@Primary

public class TransactionServiceImp implements TransactionService {

    private final RestTemplate restTemplate;
    private final TransactionRepo transactionRepo;

    @Override
    public TransactionResponse addTransaction(TransactionRequest request) {
        request.setDate(LocalDateTime.now());
        Transaction tr = request.getTransactionInterieur();
        TransactionEF transactionEF = request.getTransactionEF();
        transactionEF.setSomme(tr.getSomme());
        transactionEF.setNom(tr.getNom());
        transactionEF.setDescription(tr.getDescription());
        transactionEF.setMinistere("Interieur");

        TransactionEF transactionEFResponse = restTemplate.postForObject(
                "http://localhost:8080/api/addTransaction",transactionEF, TransactionEF.class);

        transactionRepo.save(tr);
        return new TransactionResponse(tr, transactionEFResponse.getSomme(), transactionEFResponse.getMinistere());
    }
}
