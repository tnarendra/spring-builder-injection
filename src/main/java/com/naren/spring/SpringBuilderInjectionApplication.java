package com.naren.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/ApplicationContext.xml")
public class SpringBuilderInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBuilderInjectionApplication.class, args);

		System.out.println("Employee object: " + context.getBean("employee").toString());

	}
}
