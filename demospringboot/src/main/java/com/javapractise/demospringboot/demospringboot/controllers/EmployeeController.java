package com.javapractise.demospringboot.demospringboot.controllers;

import com.javapractise.demospringboot.demospringboot.dto.EmployeeDTO;
import com.javapractise.demospringboot.demospringboot.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Operations
// GET /employees
// POST /employee
// DELETE /employee{id}

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeData(@PathVariable("id") Long eid) {
        return employeeService.getEmployeeById(eid);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployeeById(@PathVariable("id") Long empId){
        return employeeService.deleteEmployeeById(empId);
    }
}

