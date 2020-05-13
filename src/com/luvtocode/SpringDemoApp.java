package com.luvtocode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach c=context.getBean("tennisCoach", Coach.class);
        System.out.println(c.getDailyFortune());
        System.out.println(c.getDailyWorkout());
        context.close();
	}

}
