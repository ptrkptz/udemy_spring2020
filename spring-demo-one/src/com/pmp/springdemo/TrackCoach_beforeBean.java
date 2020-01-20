package com.pmp.springdemo;

public class TrackCoach_beforeBean implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach_beforeBean() {
		//Hack for MyApp.java error -- missing the fortuneService
	}
	public TrackCoach_beforeBean(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " +fortuneService.getFortune();
	}

}
