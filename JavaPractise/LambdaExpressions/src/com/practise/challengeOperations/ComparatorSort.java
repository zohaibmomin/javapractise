package com.practise.challengeOperations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort employees basis salary using ComparatorSort
public class ComparatorSort {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Zohaib",999),
                new Employee("Nazia",877658798),
                new Employee("Sarika",78),
                new Employee("Varsha",986446),
                new Employee("Aftab",6667),
                new Employee("Hello",9879)
        );

        //Option 1
        List<Employee> result = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //ascending lowest to highest salary
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());

        System.out.printf("Sorted Salary Employee List is %s \n ", result);

        //Option2
        System.out.println("Second way");
        employees.stream()
                .sorted(Comparator.comparingInt(emp -> (int) emp.getSalary()))
                .forEach(System.out::println);

    }
}
