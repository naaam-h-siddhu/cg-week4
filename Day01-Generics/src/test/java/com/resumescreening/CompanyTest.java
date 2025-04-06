package com.resumescreening;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CompanyTest {
    Company diddy ;
    Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Siddhu", "siddhusingh@gmail.com",
            new SoftwareEngineer("C++"),2);
    Resume<ProductManager> productManagerResume = new Resume<>("Nitish Kumar Singh","nitishbabu@gmail.com",
            new ProductManager("Python"), 10);
    Resume<DataScientist> dataScientistResume = new Resume<>("Karan Kumar","karan@yahoo.gov.in",
            new DataScientist("Java"),3);

    @BeforeEach
    void setDiddy(){
        diddy = new Company();
        diddy.addResume(softwareEngineerResume);
        diddy.addResume(productManagerResume);
        diddy.addResume(dataScientistResume);
    }

    @Test
    void testYoE(){
        assertEquals(10, diddy.getResumeList().get(1).getExperienceInYear());
        System.out.println("Year of experience test Passed");

    }
    @Test
    void testResumeCount(){
        assertEquals(3,diddy.getResumeList().size());
        System.out.println("Resume list count test Passed ");

    }






}