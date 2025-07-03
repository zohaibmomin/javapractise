package com.example.hmsapp.controller;

import com.example.hmsapp.model.Doctor;
import com.example.hmsapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        System.out.println("Fetching all Doctors");
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable Long id) {
        System.out.println("Fetch Doctor");
        return doctorService.getDoctor(id);
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating Doctor");
        return doctorService.createDoctor(doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        System.out.println("Deleting Doctor by id");
        doctorService.deleteDoctor(id);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor updatedDoctor) {
        System.out.println("Updated Doctor");
        return doctorService.updateDoctor(id, updatedDoctor);
    }

}
