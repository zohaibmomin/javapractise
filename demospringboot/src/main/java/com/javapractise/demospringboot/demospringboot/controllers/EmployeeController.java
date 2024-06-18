package com.javapractise.demospringboot.demospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Operations
// GET /employees
// POST /employee
// DELETE /employee{id}

@RestController
public class EmployeeController {


    @GetMapping(path = "/employees")
    public String getEmployee(){
        return "Hello Employee";
    }
}
