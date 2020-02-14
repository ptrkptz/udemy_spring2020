package com.pmp.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneSvc;
	@Value("${foo.email}")
	private String email;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneSvc=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000m as a warm-up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSvc.getFortune();
	}

}
