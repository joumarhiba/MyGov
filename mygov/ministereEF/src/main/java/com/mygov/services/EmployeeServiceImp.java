package com.mygov.services;

import com.mygov.Repository.EmployeeRepository;
import com.mygov.models.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor

public class EmployeeServiceImp implements  EmployeeService{

    private final EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}
