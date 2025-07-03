package com.example.hmsapp.service;

import com.example.hmsapp.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    public List<Appointment> getAllAppointments() {

        try {
            System.out.println("Inside the Appointment Service Layer...");
            return List.of(new Appointment());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }

    public Appointment getAppointment(Long id) {
        System.out.println("Inside the Appointment Service Layer...");
        return null;
    }

    public Appointment createAppointment(Appointment appointment) {
        System.out.println("Creating Appointment ->> Inside the Appointment Service Layer...");
        return appointment;
    }

    public void deleteAppointment(Long id) {
        System.out.println("Deleting Appointment by id -->> Inside the Appointment Service Layer...");
    }

    public void updateAppointment(Long id) {
        System.out.println("Updated Appointment ->> Inside the Appointment Service Layer...");
    }
}
