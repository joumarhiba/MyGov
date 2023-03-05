package com.mygov.Dto;

import com.mygov.models.Departement;
import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;

    private String email;

    private String firstname;

    private String lastname;
    private Departement departement;
 }
