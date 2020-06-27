package com.luvtocode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimSpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext("SportConfig.class");
     Coach c=context.getBean("swimCoach",Coach.class);
     System.out.println(c.getDailyWorkout());
	}

}
