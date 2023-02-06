package com.mygov.models;

import jakarta.persistence.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "departement")
public class Departement {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String nom;

}
