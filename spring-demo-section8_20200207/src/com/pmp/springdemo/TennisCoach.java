package com.pmp.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneSvc;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(" >> TennisCoach: inside the default constructor");
	}
	
	// define a setter method
	@Autowired
	public void doSomethingElse(FortuneService theFortuneSvc) {
		System.out.println(" >> TennisCoach: inside doSomethingElse() method");
		fortuneSvc=theFortuneSvc;
	}
	
	
	/*
	//spring scan for a component that implements FortuneService interface
	// constructor injection #63
	@Autowired
	public TennisCoach (FortuneService theFortuneSvc) {
		fortuneSvc=theFortuneSvc;
	}
	*/

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSvc.getFortune();
	}

}
