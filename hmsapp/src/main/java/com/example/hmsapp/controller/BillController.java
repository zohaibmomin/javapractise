package com.example.hmsapp.controller;

import com.example.hmsapp.model.Bill;
import com.example.hmsapp.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @Autowired
    private BillService billService;


    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Fetching all bills..");
        return billService.getAllBills();
    }

    @GetMapping("/{id}")
    public Bill getBill(@PathVariable Long id) {
        System.out.println("Fetch a bill - " + id);
        return billService.getBill(id);
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("Creating bill for " + bill);
        return billService.createBill(bill);
    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable Long id) {
        System.out.println("Update bill " + id);
        billService.updateBill(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        System.out.println("Delete bill " + id);
        billService.deleteBill(id);
    }
}
