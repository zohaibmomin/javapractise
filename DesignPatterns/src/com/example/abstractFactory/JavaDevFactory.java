package com.example.abstractFactory;

public class JavaDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee getEmployee() {
        return new JavaDeveloper();
    }
}
