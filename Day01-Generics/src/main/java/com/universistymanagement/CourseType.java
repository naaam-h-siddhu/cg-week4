package com.universistymanagement;

public abstract class CourseType {

    private String method;

    public CourseType(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" ("+method+" )";
    }

    public String getMethod() {
        return method;
    }
}
