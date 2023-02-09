package com.mygov.Controller;

import com.mygov.common.TransactionEF;
import com.mygov.Services.TransactionService;
import com.mygov.common.TransactionRequest;
import com.mygov.common.TransactionResponse;
import com.mygov.models.Transaction;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TransactionController {
    @Autowired
    private ModelMapper modelMapper;
    private final TransactionService transactionService;

    @PostMapping("/addTransaction")
    public TransactionResponse addTransaction(@RequestBody TransactionRequest request) {

        TransactionRequest transactionReq = modelMapper.map(request, TransactionRequest.class);

        TransactionResponse transaction = transactionService.addTransaction(transactionReq);
        TransactionEF newtransaction = modelMapper.map(transaction, TransactionEF.class);

        return transaction;
    }

}
