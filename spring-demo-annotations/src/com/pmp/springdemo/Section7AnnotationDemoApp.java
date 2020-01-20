package com.pmp.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Section7AnnotationDemoApp {

	public static void main(String[] args) {
		//
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("footballCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
