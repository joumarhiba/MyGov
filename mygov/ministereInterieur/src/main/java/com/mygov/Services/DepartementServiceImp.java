package com.mygov.Services;

import com.mygov.models.Departement;
import com.mygov.Repository.DepartementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DepartementServiceImp implements DepartementService {
    private final DepartementRepository departementRepository;

    @Override
    public Departement saveDepartement(Departement departement) {
        Departement savedDepartement = departementRepository.save(departement);
        return savedDepartement;
    }

    @Override
    public List<Departement> getDepartements() {
        List<Departement> departements = departementRepository.findAll();
        return departements;
    }
}
