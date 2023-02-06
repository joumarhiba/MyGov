package com.mygov.services;

import com.mygov.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public Employee addEmployee(Employee employee);
    public Iterable<Employee> getEmployees();

    public void deleteEmployee(String id);

}
