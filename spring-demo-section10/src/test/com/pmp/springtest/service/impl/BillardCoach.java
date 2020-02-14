package test.com.pmp.springtest.service.impl;

import org.springframework.beans.factory.annotation.Value;

import test.com.pmp.springtest.service.Coach;
import test.com.pmp.springtest.service.Fortune;

public class BillardCoach implements Coach {
	
	private Fortune fortune;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public BillardCoach(Fortune theFortune) {
		fortune = theFortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 8 - ball!!";
	}

	@Override
	public String getFortune() {
		return fortune.getDailyFortune();
	}
	
	

}
