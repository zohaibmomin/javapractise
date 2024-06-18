package com.javapractise.demospringboot.demospringboot.services;

import com.javapractise.demospringboot.demospringboot.dto.EmployeeDTO;
import com.javapractise.demospringboot.demospringboot.entity.EmployeeEntity;
import com.javapractise.demospringboot.demospringboot.repository.EmployeeRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDTO getEmployeeById(Long id) {
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(id);
        //convert Entity to DTO
        return employeeEntity.map(entity -> new EmployeeDTO(entity.getId(), entity.getName(), entity.getDoj())).orElse(new EmployeeDTO());

    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
        //convert EmployeeDTO to Entity ( DTO to DAO)
        EmployeeEntity employeeEntity = new EmployeeEntity(employeeDTO.getId(),employeeDTO.getName(),employeeDTO.getDoj());
        EmployeeEntity r = employeeRepository.save(employeeEntity);
        return new EmployeeDTO(r.getId(),r.getName(),r.getDoj());
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeEntity> employees = employeeRepository.findAll();
        List<EmployeeDTO> emp = employees.stream().map(entity -> new EmployeeDTO(entity.getId(), entity.getName(), entity.getDoj())).toList();
        return emp;
    }

    public boolean deleteEmployeeById(Long empId) {
        boolean isPresent = employeeRepository.existsById(empId);
        if(isPresent){
            employeeRepository.deleteById(empId);
            return true;
        }
        return false;
    }
}

