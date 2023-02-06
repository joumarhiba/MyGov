package com.mygov.Controller;

import com.mygov.Repository.EmployeeRepository;
import com.mygov.models.Employee;
import com.mygov.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee) {
      return employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmployees")
    public Iterable<Employee> getEmployees() {
//        return employeeService.getEmployees();
        return employeeRepository.findAll();
    }

    @DeleteMapping("deleteEmployee")
    public void deleteEmployee(@RequestBody String id) {
        employeeService.deleteEmployee(id);
    }
}
