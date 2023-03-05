package com.mygov.Controller;


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

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee) {
      return employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmployees")
    public Iterable<Employee> getEmployees() {
       return employeeService.getEmployees();

    }

    @DeleteMapping("deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }
}
