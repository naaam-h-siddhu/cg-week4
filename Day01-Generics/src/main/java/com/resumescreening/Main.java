package com.resumescreening;

public class Main {
    public static void main(String[] args) {
        Company diddy = new Company();
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Siddhu", "siddhusingh@gmail.com",
                new SoftwareEngineer("C++"),2);
        Resume<ProductManager> productManagerResume = new Resume<>("Nitish Kumar Singh","nitishbabu@gmail.com",
                new ProductManager("Python"), 10);
        Resume<DataScientist> dataScientistResume = new Resume<>("Karan Kumar","karan@yahoo.gov.in",
                new DataScientist("Java"),3);

        diddy.addResume(softwareEngineerResume);
        diddy.addResume(productManagerResume);
        diddy.addResume(dataScientistResume);
        diddy.displayResumeList();

    }
}
