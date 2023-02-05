package com.mygov.Services;

import com.mygov.Repository.EmployeeRepository;
import com.mygov.models.Employee;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

@Transactional

@Primary

public interface EmployeeService {

    public Employee saveEmployee(Employee employee);

    public List<Employee> getEmployees() ;
    }
