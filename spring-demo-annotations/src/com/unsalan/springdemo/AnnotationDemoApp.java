package com.unsalan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config
		
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);		
		
		// call a method on a bean
		
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the contex
		
		context.close();
	}

}
