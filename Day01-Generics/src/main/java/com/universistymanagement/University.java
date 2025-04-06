package com.universistymanagement;

import java.util.ArrayList;
import java.util.List;

public class University {
    public List<Course<? extends CourseType>> getCourses() {
        return courses;
    }

    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course){
        courses.add(course);
    }
    public void displayCourses(){
        System.out.println("Courses : ");
        for(Course<? extends CourseType> course: courses){
            System.out.println(course);
        }
    }
}
