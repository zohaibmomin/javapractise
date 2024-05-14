package com.example.bank;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double money){
        this.balance = this.balance + money;
        System.out.println("Deposited successfully");

    }

    public void withdrawMoney(double money){
        if(money <= this.balance){
            this.balance = this.balance - money;
            System.out.println("Successfully withdrawn !");
        }else{
            System.out.println("Operation Not Allowed :: Current Balance is less than Money to be withdrawn!");
        }
    }
}
