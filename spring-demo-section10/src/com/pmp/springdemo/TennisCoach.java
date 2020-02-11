package com.pmp.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneSvc;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(" >> TennisCoach: inside the default constructor");
	}
	
	//define init method
	@PostConstruct
	public void doStartup() {
		System.out.println(" >> TennisCoach: inside Startup");
	}
	// define destroy method
	@PreDestroy
	public void doCleanup() {
		System.out.println(" >> TennisCoach: inside Cleanup");
	}
	
	
	// define a setter method
	/*@Autowired
	public void doSomethingElse(FortuneService theFortuneSvc) {
		System.out.println(" >> TennisCoach: inside doSomethingElse() method");
		fortuneSvc=theFortuneSvc;
	}*/
	
	
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
