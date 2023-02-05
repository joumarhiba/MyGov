package com.mygov.Services;

import com.mygov.DTO.Admin;
import com.mygov.DTO.Departement;
import com.mygov.Repository.AdminRepository;
import com.mygov.Repository.DepartementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.Delayed;

@Service
@RequiredArgsConstructor

public class DepartementService {
    private final DepartementRepository departementRepository;

    public Departement saveADepartement(Departement departement) {
        Departement savedDepartement = departementRepository.save(departement);
        return savedDepartement;
    }
}
