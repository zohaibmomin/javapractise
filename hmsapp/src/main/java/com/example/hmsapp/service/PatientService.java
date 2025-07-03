package com.example.hmsapp.service;

import com.example.hmsapp.model.Patient;
import com.example.hmsapp.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Patient> getAllPatients() {
        try {
            System.out.println("Inside the Patient Service Layer...");
            return patientRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }

    public Patient getPatient(Long id) {
        System.out.println("Inside the Patient Service Layer...");
        Optional<Patient> patient = patientRepository.findById(id);
        return patient.orElse(null);
    }

    public Patient createPatient(Patient patient) {
        try {
            System.out.println("Creating Patient ->> Inside the Patient Service Layer...");
            patientRepository.save(patient);
            return patient;
        } catch (Exception e) {
            logger.error("An error occured {}", e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
        System.out.println("Deleting Patient by id -->> Inside the Patient Service Layer...");
        logger.info("Deleted successfully {}", id);
    }

    public Patient updatePatient(Long id, Patient updatedPatient) {
        System.out.println("Updated Patient ->> Inside the Patient Service Layer...");
        Optional<Patient> existingPatient = patientRepository.findById(id);
        if (existingPatient.isPresent()) {
            Patient p = existingPatient.get();
            p.setAge(updatedPatient.getAge());
            p.setName(updatedPatient.getName());
            p.setGender(updatedPatient.getGender());
            patientRepository.save(p);
            logger.info("Updated Patient {} successfully ", id);
            return p;
        } else {
            logger.error("Patient with id {} to be updated not found ", id);
            return null;
        }

    }
}
