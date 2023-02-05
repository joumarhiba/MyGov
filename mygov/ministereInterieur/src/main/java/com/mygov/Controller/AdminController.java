package com.mygov.Controller;

import com.mygov.Repository.AdminRepository;
import com.mygov.Services.AdminService;
import com.mygov.DTO.Admin;
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

    private final AdminService  adminService;

    @PostMapping("/createDepartement")
    public ResponseEntity<Object> createDepartement(@RequestBody Admin admin) {
        Admin response = adminService.saveAdmin(admin);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
