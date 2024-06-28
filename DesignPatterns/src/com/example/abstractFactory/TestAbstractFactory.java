package com.example.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployeeClient(new AndroidDevFactory());
        System.out.println(employee1.name());
        System.out.println(employee1.salary());

        Employee employee2 = EmployeeFactory.getEmployeeClient(new JavaDevFactory());
        System.out.println(employee2.name());
        System.out.println(employee2.salary());
    }
}
