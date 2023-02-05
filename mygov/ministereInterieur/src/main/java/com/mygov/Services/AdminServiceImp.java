package com.mygov.Services;

import com.mygov.models.Admin;
import com.mygov.Repository.AdminRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
@Primary

public class AdminServiceImp implements AdminService{
    private final AdminRepository adminRepository;
    @Override
    public Admin saveAdmin(Admin admin) {
        Admin savedAdmin = adminRepository.save(admin);
        return savedAdmin;
    }
}
