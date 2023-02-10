package com.mygov.common;

import com.mygov.models.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TransactionResponse {
    private Transaction transaction;
    private int somme;
    private String ministere;
}
