package com.bob.loadingFromProperties;

import org.springframework.beans.factory.annotation.Value;


public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.interestedCourse}")
    private String interestedCourse;
    @Value("${student.hobby}")
    private String hobby;

    /*public void setName(String name) {
        this.name = name;
    }


    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }*/

    public void displayStudentInfo(){
        System.out.println("Student name: "+name);
        System.out.println("Student course of interest: "+interestedCourse);
        System.out.println("Student Hobby: "+hobby);
    }
}
