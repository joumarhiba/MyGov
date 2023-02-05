package com.mygov.Services;

import com.mygov.models.Admin;
import com.mygov.Repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface AdminService {

    public Admin saveAdmin(Admin admin);
}
