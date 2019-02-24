package com.unsalan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	private String email;
	private String phone;
	
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}	
	
	/*
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	*/
	/*
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("inside setter method for doSomeCrazyStuff");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice on your service returns";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}
}
