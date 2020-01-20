package com.pmp.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Try to throw a 30 yard pass";
		
	}

}
