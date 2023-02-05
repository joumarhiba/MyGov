package com.mygov.Controller;

import com.mygov.Dto.DepartementDto;
import com.mygov.Services.DepartementService;
import com.mygov.Services.DepartementServiceImp;
import com.mygov.models.Departement;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class DepartementController {

    @Autowired
    private ModelMapper modelMapper;

    private final DepartementService departementService;

    @PostMapping("/addDepartement")
    public ResponseEntity<DepartementDto> addDepartement(@RequestBody DepartementDto departementDto) {
        Departement departementReq = modelMapper.map(departementDto, Departement.class);
        Departement departement = departementService.saveDepartement(departementReq);
        DepartementDto response = modelMapper.map(departement, DepartementDto.class);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/getDepartements")
    public List<DepartementDto> getEmployees() {
        return departementService.getDepartements().stream().map(
                departement -> modelMapper.map(departement, DepartementDto.class)
        ).collect(Collectors.toList());
    }
}
