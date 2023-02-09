package com.mygov.models;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "employee")
@Data
public class Employee {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String email;

    @Field(type = FieldType.Text)
    private String firstname;

    @Field(type = FieldType.Text)
    private String lastname;
}
