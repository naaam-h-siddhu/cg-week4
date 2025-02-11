package com.resumescreening;

import java.util.ArrayList;
import java.util.List;

public abstract class JobRole {
    private String programmingLanguage;
    ArrayList<Resume> resumes = new ArrayList<>();
    public JobRole(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void addResume(Resume resume){
        resumes.add(resume);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
