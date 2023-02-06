package com.mygov.services;

import com.mygov.Repository.EmployeeRepository;
import com.mygov.models.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class EmployeeServiceImp implements  EmployeeService{

    private final EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        return employees;
    }
}
