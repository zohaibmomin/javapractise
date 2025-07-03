package com.example.hmsapp.service;

import com.example.hmsapp.model.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    public List<Bill> getAllBills() {
        System.out.println("Service Layer :: Fetching all bills..");
        return null;
    }

    public Bill getBill(Long id) {
        System.out.println("Service Layer :: Fetch a bill - " + id);
        return null;
    }

    public Bill createBill(Bill bill) {
        System.out.println("Service Layer :: Creating bill for " + bill);
        return bill;
    }

    public void updateBill(Long id) {
        System.out.println("Service Layer :: Update bill " + id);
    }

    public void deleteBill(Long id) {
        System.out.println("Service Layer :: Delete bill " + id);
        logger.error("An error occured while deleting as an example test....");
    }
}
