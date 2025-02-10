package com.universistymanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Course<? extends CourseType>> courses = new ArrayList<>();
    public static void main(String[] args) {
        University university = new University();
        Course<ExamBased> mathCourse = new Course<>("Mathematics","PCM", new ExamBased());
        Course<AssignmentCourse> programming  = new Course<>("C++", "Computer Science", new AssignmentCourse());
        Course<ResearchCourse> aiml = new Course<>("Artificial Intelligence","AI & ML", new ResearchCourse());

        university.addCourse(mathCourse);
        university.addCourse(programming);
        university.addCourse(aiml);
        university.displayCourses();
//        System.out.println(university.getCourses().get(1).getCourseName());
        courses.add(mathCourse);
        courses.add(programming);
        System.out.println(courses);

    }
}
