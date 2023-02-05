package com.mygov.Services;

import com.mygov.Repository.EmployeeRepository;
import com.mygov.DTO.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

    public List<Employee> getEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
}
