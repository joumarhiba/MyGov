package com.mygov.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionDto {
    private Long id;
    private String nom;
    private String description;
    private int somme;
    private LocalDateTime date;
    private String ministere;
}