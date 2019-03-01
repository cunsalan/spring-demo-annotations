package com.unsalan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		AnnotationConfigApplicationContext logContext = new AnnotationConfigApplicationContext(MyLoggerConfig.class);
		
		
		
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune().getFortune());
		
		context.close();

	}

}
