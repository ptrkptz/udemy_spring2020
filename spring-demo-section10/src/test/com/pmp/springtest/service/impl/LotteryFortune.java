package test.com.pmp.springtest.service.impl;

import java.util.Random;
import test.com.pmp.springtest.service.Fortune;

public class LotteryFortune implements Fortune {

	@Override
	public String getDailyFortune() {
		
		Random rand = new Random();
		return "Your lucky number today is: "+rand.nextInt(100);
	}

}
