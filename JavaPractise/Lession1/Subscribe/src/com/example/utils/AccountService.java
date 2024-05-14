package com.example.utils;

import com.example.bank.BankAccount;

public class AccountService {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Zohaib Momin", 11109989,0);
        acc.depositMoney(100);
        System.out.printf("Current Balance : %f", acc.getBalance());
        System.out.println();
        acc.withdrawMoney(9);
        System.out.println();
        System.out.printf("Current Balance : %f", acc.getBalance());
        System.out.println();
        acc.withdrawMoney(999);

    }
}
