package com.example.abstractFactory;

public class EmployeeFactory {

    public static Employee getEmployeeClient(EmployeeAbstractFactory factory) {
            return factory.getEmployee();
    }
}
