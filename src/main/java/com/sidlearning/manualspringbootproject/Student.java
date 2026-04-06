package com.sidlearning.manualspringbootproject;

import org.springframework.stereotype.Component;

@Component // It will the create an object and push in to the main container too.
public class Student {
    String studentName = "Sid";

    public Student(String studentName) {
        super();
        this.studentName = studentName;
    }

    public Student() {
        super();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
