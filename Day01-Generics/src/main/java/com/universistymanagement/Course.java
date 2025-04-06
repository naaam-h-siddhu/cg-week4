package com.universistymanagement;

public class Course< T extends CourseType>{
    private String courseName;
    private String department;
    private T courseType;

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public T getCourseType() {
        return courseType;
    }

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return "Course: "+courseName+" | Department: "+department+" | Type: "+courseType;
    }
}
