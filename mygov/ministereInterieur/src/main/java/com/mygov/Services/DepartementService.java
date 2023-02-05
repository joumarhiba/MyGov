package com.mygov.Services;

import com.mygov.models.Departement;
import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

@Primary
public interface DepartementService {

    public Departement saveDepartement(Departement departement);
    public List<Departement> getDepartements();
}
