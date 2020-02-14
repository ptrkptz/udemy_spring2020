package test.com.pmp.springtest.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import test.com.pmp.springtest.service.Coach;
import test.com.pmp.springtest.service.Fortune;
import test.com.pmp.springtest.service.impl.BillardCoach;
import test.com.pmp.springtest.service.impl.LotteryFortune;

@Configuration
@PropertySource("classpath:resources/sport.properties")
public class TestConfig {

	@Bean 
	public Fortune lotteryFortune() {
		return new LotteryFortune();
	}
	
	@Bean 
	public Coach billardCoach() {
		return new BillardCoach(lotteryFortune());
	}
}
