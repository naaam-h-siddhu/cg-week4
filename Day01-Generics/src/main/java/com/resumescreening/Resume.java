package com.resumescreening;

public class Resume<T extends JobRole>{
    private String name;
    private String email;
    private T jobRole;
    private int experienceInYear;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public T getJobRole() {
        return jobRole;
    }

    public int getExperienceInYear() {
        return experienceInYear;
    }

    public Resume(String name, String email, T jobRole, int experienceInYear) {
        this.name = name;
        this.email = email;
        this.jobRole = jobRole;
        this.experienceInYear = experienceInYear;
    }
    public void getDetails(){
        System.out.println(name+" | "+email+" | "+jobRole.toString()+" | "+experienceInYear);
    }
}
