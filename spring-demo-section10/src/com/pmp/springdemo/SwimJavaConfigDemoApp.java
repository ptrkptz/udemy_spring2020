package com.pmp.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportsConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call method to get the email
		System.out.println(theCoach.getEmail());
		
		// call method to get the team
		System.out.println(theCoach.getTeam());
		
		// close context
		context.close();
	}

}
