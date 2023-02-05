package com.mygov.Services;

import com.mygov.DTO.Admin;
import com.mygov.Repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;

    public Admin saveAdmin(Admin admin) {
        Admin savedAdmin = adminRepository.save(admin);
        return savedAdmin;
    }
}
