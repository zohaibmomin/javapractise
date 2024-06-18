package com.javapractise.demospringboot.demospringboot.services;

import com.javapractise.demospringboot.demospringboot.dto.EmployeeDTO;
import com.javapractise.demospringboot.demospringboot.entity.EmployeeEntity;
import com.javapractise.demospringboot.demospringboot.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long id) {
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(id);
        //convert Entity to DTO
        // return employeeEntity.map(entity -> new EmployeeDTO(entity.getId(), entity.getName(), entity.getDoj())).orElse(new EmployeeDTO());
        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
        //convert EmployeeDTO to Entity ( DTO to DAO)
        // EmployeeEntity employeeEntity = new EmployeeEntity(employeeDTO.getId(),employeeDTO.getName(),employeeDTO.getDoj());
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        EmployeeEntity r = employeeRepository.save(employeeEntity);
        // return new EmployeeDTO(r.getId(),r.getName(),r.getDoj());
        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeEntity> employees = employeeRepository.findAll();
        //List<EmployeeDTO> emp = employees.stream().map(entity -> new EmployeeDTO(entity.getId(), entity.getName(), entity.getDoj())).toList();
        List<EmployeeDTO> emp = employees.stream()
                .map(entity->modelMapper.map(entity,EmployeeDTO.class)).toList();

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

