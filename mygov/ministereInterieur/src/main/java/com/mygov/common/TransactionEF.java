package com.mygov.common;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEF {
    private Long id;
    private String nom;
    private String description;
    private int somme;
    private LocalDateTime date;
    private String ministere;

    public LocalDateTime setDate(LocalDateTime date) {
       return this.date = date;
    }
}