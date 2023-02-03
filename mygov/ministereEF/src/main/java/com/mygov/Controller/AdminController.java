package com.mygov.Controller;

import com.mygov.Repository.AdminRepository;
import com.mygov.models.Admin;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class AdminController {

    private final AdminRepository adminRepository;

    @PostMapping("/createDepartement")
    public ResponseEntity<Object> createDepartement(@RequestBody Admin admin) {
        Admin response = adminRepository.save(admin);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
