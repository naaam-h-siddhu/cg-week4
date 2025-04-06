package com.queueinterface;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient>{
    private String name;
    private int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Patient o) {
        return Integer.compare(o.priority,this.priority);

    }
}
public class HospitalTriageSystem {
    public static List<String> triagePatient(List<Patient> patients){
        List<String> order = new ArrayList<>();
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();
        for(Patient patient: patients){
            priorityQueue.add(patient);
        }
        while(!priorityQueue.isEmpty()){
            order.add(priorityQueue.poll().getName());
        }
        return order;
    }
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient("John", 3));
        patients.add(new Patient("Alice", 5));
        patients.add(new Patient("Bob", 2));
        patients.add(new Patient("Eve", 1));
        patients.add(new Patient("David", 4));

        List<String> patientTreatmentOrder = triagePatient(patients);
        System.out.println("Order of Treatment of patient: "+patientTreatmentOrder);
    }

}
