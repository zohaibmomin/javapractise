package com.example.hmsapp.controller;

import com.example.hmsapp.model.Appointment;
import com.example.hmsapp.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    //get all appointments
    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("Getting list of all appointments...");
        return appointmentService.getAllAppointments();
    }

    //get appointment by id
    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable Long id){
        System.out.println("Get Appointment");
        return appointmentService.getAppointment(id);
    }

    //create an appointment
    @PostMapping
    public Appointment createAppointment(){
        System.out.println("Creating an appointment");
        return appointmentService.createAppointment(new Appointment());
    }

    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id){
        System.out.println("Update an appointment");
        appointmentService.updateAppointment(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        System.out.println("Deleting Appointment by id");
        appointmentService.deleteAppointment(id);
    }


}
