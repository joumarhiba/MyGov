package com.mygov.Services;

import com.mygov.models.Departement;
import com.mygov.Repository.DepartementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class DepartementService {
    private final DepartementRepository departementRepository;

    public Departement saveADepartement(Departement departement) {
        Departement savedDepartement = departementRepository.save(departement);
        return savedDepartement;
    }
}
