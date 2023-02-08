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
    public ResponseEntity<TransactionDto> addEmployee(@RequestBody TransactionDto transactionDto) {
        Transaction employeeReq = modelMapper.map(transactionDto, Transaction.class);
        Transaction employee = transactionService.addTransaction(employeeReq);
        TransactionDto response = modelMapper.map(employee, TransactionDto.class);
        return new ResponseEntity<TransactionDto>(response, HttpStatus.CREATED);
    }

}
