package com.pmp.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pmp.springdemo.FortuneService;

@Component
public class Coach1A implements Coach {
	
	// field injection
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneSvc;

	@Override
	public String getDailyWorkout() {
		return "Just practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSvc.getFortune();
	}

}
