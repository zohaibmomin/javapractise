package com.javapractise.demospringboot.demospringboot.repository;

import com.javapractise.demospringboot.demospringboot.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    //You get all the in-built methods of EmployeeRepository

}
