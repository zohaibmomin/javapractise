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
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployeeData(@PathVariable("id") Long eid) {
        return employeeService.getEmployeeById(eid);
    }

    @GetMapping(path = "/employees")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping(path = "/employees")
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createNewEmployee(employeeDTO);
    }
}

