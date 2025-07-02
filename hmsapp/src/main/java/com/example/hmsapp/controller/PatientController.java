package com.example.hmsapp.controller;

import com.example.hmsapp.model.Patient;
import com.example.hmsapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        System.out.println("Fetching all Patients");
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        System.out.println("Fetch Patient");
        return patientService.getPatient(id);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("Received patient -> " + patient);
        return patientService.createPatient(patient);
    }


    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        System.out.println("Deleting Patient by id");
        patientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        System.out.println("Updated Patient");
        return patientService.updatePatient(id, updatedPatient);
    }

}
