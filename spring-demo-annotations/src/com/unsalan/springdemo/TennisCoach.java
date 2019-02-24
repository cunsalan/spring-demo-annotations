package com.unsalan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Autowired
	public TennisCoach(@Qualifier("newFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}	
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
	public FortuneService getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService;
	}
}
