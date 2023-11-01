package com.spring.DipendancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student Bob = context.getBean("student",Student.class);
        Bob.DisplayStudentInfo();

        Student Larry = context.getBean("larry",Student.class);
        Larry.DisplayStudentInfo();

    }
}
