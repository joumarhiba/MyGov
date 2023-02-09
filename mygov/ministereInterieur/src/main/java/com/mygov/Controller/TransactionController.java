package com.mygov.Controller;

import com.mygov.Dto.TransactionDto;
import com.mygov.Services.TransactionService;
import com.mygov.models.Transaction;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<TransactionDto> addTransaction(@RequestBody TransactionDto transactionDto) {
        Transaction transactionReq = modelMapper.map(transactionDto, Transaction.class);
        Transaction transaction = transactionService.addTransaction(transactionReq);
        TransactionDto newtransaction = modelMapper.map(transaction, TransactionDto.class);
        return new ResponseEntity<TransactionDto>(newtransaction, HttpStatus.CREATED);
    }

}
