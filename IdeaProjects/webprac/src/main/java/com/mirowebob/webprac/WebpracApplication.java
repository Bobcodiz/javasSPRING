package com.mirowebob.webprac;

import com.mirowebob.webprac.Controller.HomeController;
import com.mirowebob.webprac.Controller.Welcoming;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class WebpracApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(WebpracApplication.class, args);
		HomeController homeController = context.getBean(HomeController.class);

		Welcoming welcome = (Welcoming) context.getBean("homecoming");

		System.out.println(homeController.welcomeHome());
		System.out.println(welcome.comeHome());

	}

}
