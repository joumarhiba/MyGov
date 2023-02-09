package com.mygov.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Document(indexName = "transaction")

public class Transaction {
    @Id

    private String id;
    @Field(type = FieldType.Text)
    private String nom;
    @Field(type = FieldType.Text)
    private String description;
    @Field(type = FieldType.Integer)
    private int somme;
    @Field(type = FieldType.Date)
    private LocalDateTime date;
    private String ministere;
}
