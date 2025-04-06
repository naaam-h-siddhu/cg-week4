package com.mapinterface;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManagement {
    public static Map<String, List<String>> getMap(Employee[] employees){
        Map<String, List<String>> listMap = new HashMap<>();
        for (Employee employee : employees) {
            if (listMap.containsKey(employee.getDepartment())) {
                List<String> emplo = listMap.get(employee.getDepartment());
                emplo.add(employee.getName());
                listMap.put(employee.getDepartment(), emplo);
            } else {
                List<String> emplo = new ArrayList<>();
                emplo.add(employee.getName());
                listMap.put(employee.getDepartment(), emplo);
            }
        }
        return listMap;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice","HR");
        Employee e2 = new Employee("Bob", "IT");
        Employee e3 = new Employee("Carol","HR");

        Employee[] employees = new Employee[3];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        Map<String, List<String>> employeeDatabase = getMap(employees);
        System.out.println(employeeDatabase);

    }
}
class Employee{
    private String name;
    private String department;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}
