package com.meanplan;

public class User {
    private String name;
    private int weight;
    private int age;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
