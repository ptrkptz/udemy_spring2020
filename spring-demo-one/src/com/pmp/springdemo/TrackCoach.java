package com.pmp.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		//Hack for MyApp.java error -- missing the fortuneService
	}
	public TrackCoach(FortuneService fortuneService) {
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
	
	// add init method
	public void doMyStartup() {
		System.out.println("Track Coach: inside method doMyStartup");
	}
	
	// add destroy method
	public void doMyCleanup() {
		System.out.println("Track Coach: inside method doMyCleanup");
	}
}
