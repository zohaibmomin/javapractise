package com.javapractise.demospringboot.demospringboot.controllers;

import com.javapractise.demospringboot.demospringboot.dto.EmployeeDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

//Operations
// GET /employees
// POST /employee
// DELETE /employee{id}

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees/{id}")
        public EmployeeDTO getEmployeeData(@PathVariable("id") Long eid) {
        return new EmployeeDTO(eid,
                "Zohaib-" + eid,
                LocalDate.now());
    }

    @GetMapping(path = "/employees")
    public ArrayList<EmployeeDTO> getEmployee(@PathParam("sortBy") String sortBy,
                                              @PathParam("limit") int limit) {
        ArrayList<EmployeeDTO> employees = new ArrayList<>();
        employees.add(new EmployeeDTO(123L,
                "Zohaib-" + sortBy + "-" + limit,
                LocalDate.now()));
        employees.add(new EmployeeDTO(222L,
                "Nazia-" + sortBy + "-" + limit,
                LocalDate.of(2024, 1, 1)));

        return employees;
    }
}
