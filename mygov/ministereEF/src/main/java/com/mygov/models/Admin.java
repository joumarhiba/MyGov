package com.mygov.models;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "admin")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Admin {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String email;

    @Field(type = FieldType.Text)
    private String password;

}
