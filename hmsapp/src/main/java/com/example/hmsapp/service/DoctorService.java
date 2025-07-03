package com.example.hmsapp.service;

import com.example.hmsapp.model.Doctor;
import com.example.hmsapp.repository.DoctorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    public List<Doctor> getAllDoctors() {

        try {
            System.out.println("Inside the Doctor Service Layer...");
            return doctorRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            logger.error("Error found ", e);
            return null;
        }
    }

    public Doctor getDoctor(Long id) {
        System.out.println("Inside the Doctor Service Layer...");
        return doctorRepository.findById(id).orElse(null);
    }

    public Doctor createDoctor(Doctor doctor) {
        System.out.println("Creating Doctor ->> Inside the Doctor Service Layer...");
        doctorRepository.save(doctor);
        logger.info("Saved successfully");
        return doctor;
    }

    public void deleteDoctor(Long id) {
        System.out.println("Deleting Doctor by id -->> Inside the Doctor Service Layer...");
        doctorRepository.deleteById(id);
        logger.info("Deleted successfully");
    }

    public Doctor updateDoctor(Long id, Doctor updatedDoctor) {
        System.out.println("Updated Doctor ->> Inside the Doctor Service Layer...");

        Optional<Doctor> existingDoctor = doctorRepository.findById(id);

        if (existingDoctor.isPresent()) {
            Doctor d = existingDoctor.get();
            d.setAge(updatedDoctor.getAge());
            d.setGender(updatedDoctor.getGender());
            d.setName(updatedDoctor.getName());

            doctorRepository.save(d);
            logger.info("Saved successfully...");
            return d;
        }else{
            logger.error("Not found {}", id);
            return null;
        }

    }
}
