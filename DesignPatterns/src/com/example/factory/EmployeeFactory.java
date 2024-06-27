package com.example.factory;

public class EmployeeFactory {

    public static Employee getEmployeeClient(String empType) {
        if (empType.equals("Android")) return new AndroidDeveloper();
        if (empType.equals("Java")) return new JavaDeveloper();
        return null;
    }
}
