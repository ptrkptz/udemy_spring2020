package test.com.pmp.springtest.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.com.pmp.springtest.config.TestConfig;
import test.com.pmp.springtest.service.impl.BillardCoach;

public class section10TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(TestConfig.class);
		
		BillardCoach bC = context.getBean("billardCoach",BillardCoach.class);
		
		System.out.println(bC.getDailyWorkout());
		System.out.println(bC.getFortune());
	
		System.out.println(bC.getTeam());
		System.out.println(bC.getEmail());
		context.close();

	}

}
