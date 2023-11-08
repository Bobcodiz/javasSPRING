package com.bob.loadingFromProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded...");
		Student student = context.getBean("student",Student.class);
		student.displayStudentInfo();
	}

}
