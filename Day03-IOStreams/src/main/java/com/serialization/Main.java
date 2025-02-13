package com.serialization;

import java.io.*;
import java.util.Arrays;
import java.util.List;

class Employee implements Serializable{
    private int id;
    private String name;
    private String department;
    private int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "siddhu", "IT", 100000),
                new Employee(2, "Nitish", "SDE", 1000000),
                new Employee(3, "Karan", "CEO", 2000000)
        );
        String filePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/testfile.txt";

        //Serialization
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))){
            objectOutputStream.writeObject(employees);
            System.out.println("Object successfully serialized");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Deserialization
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
            List<Employee> des =  (List<Employee>) objectInputStream.readObject();

            for(Employee employee:des){
                System.out.println(employee.toString());
            }
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
