package com.example.springSecurity.springSecurityAuth.repositories;

import com.example.springSecurity.springSecurityAuth.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}
