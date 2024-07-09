package com.example.springSecurity.springSecurityAuth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/admin")
    public ResponseEntity<String> adminUser() {
        return ResponseEntity.ok("Hello, I am admin user");
    }

    @GetMapping("/public")
    public ResponseEntity<String> publicUser() {
        return ResponseEntity.ok("Hello, I am public user");
    }

    @GetMapping("/normal")
    public ResponseEntity<String> normalUser() {
        return ResponseEntity.ok("Hello, I am normal user");
    }


}
