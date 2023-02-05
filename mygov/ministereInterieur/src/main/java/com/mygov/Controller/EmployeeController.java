package com.mygov.Controller;

import com.mygov.Repository.EmployeeRepository;
import com.mygov.models.Employee;
import com.mygov.Dto.EmployeeDto;
import com.mygov.Services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {
    @Autowired
    private ModelMapper modelMapper;

    private final EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employeeReq = modelMapper.map(employeeDto, Employee.class);
        Employee employee = employeeService.saveEmployee(employeeReq);
        EmployeeDto response = modelMapper.map(employee, EmployeeDto.class);
        return new ResponseEntity<EmployeeDto>(response, HttpStatus.CREATED);
    }

    @GetMapping("/getEmployees")
    public List<EmployeeDto> getEmployees() {
        return employeeService.getEmployees().stream().map(
                employee -> modelMapper.map(employee, EmployeeDto.class)
        ).collect(Collectors.toList());
    }

}
