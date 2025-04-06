package com.universistymanagement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {
    private List<Course<? extends CourseType>> courseList;
     @BeforeEach
    void setUp(){
         courseList = new ArrayList<>();
         Course<ExamBased> mathCourse = new Course<>("Mathematics","PCM", new ExamBased());
         Course<AssignmentCourse> programming  = new Course<>("C++", "Computer Science", new AssignmentCourse());
         Course<ResearchCourse> aiml = new Course<>("Artificial Intelligence","AI & ML", new ResearchCourse());

         courseList.add(mathCourse);
         courseList.add(programming);
         courseList.add(aiml);
     }

     @Test
    void TestUniversity(){
         Assertions.assertEquals("C++",courseList.get(1).getCourseName());
     }

}