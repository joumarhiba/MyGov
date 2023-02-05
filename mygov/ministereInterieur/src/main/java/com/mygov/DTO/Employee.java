package com.mygov.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    private Long id;

    private String email;

    private String firstname;

    private String lastname;
}
