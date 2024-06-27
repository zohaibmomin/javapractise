package com.example.factory;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployeeClient("Android");
        assert employee != null;
        System.out.printf("Salary is - %s", employee.salary());

        Employee employee2 = EmployeeFactory.getEmployeeClient("Java");
        assert employee2 != null;
        System.out.printf("Salary is - %s",employee2.salary());
    }
}
