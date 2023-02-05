package com.mygov.Services;

import com.mygov.models.Departement;
import com.mygov.Repository.DepartementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DepartementService {
    private final DepartementRepository departementRepository;

    public Departement saveDepartement(Departement departement) {
        Departement savedDepartement = departementRepository.save(departement);
        return savedDepartement;
    }

    public List<Departement> getDepartements() {
        List<Departement> departements = departementRepository.findAll();
        return departements;
    }
}
