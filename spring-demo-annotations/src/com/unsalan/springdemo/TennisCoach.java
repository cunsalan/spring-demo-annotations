package com.unsalan.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
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
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach : inside of doMyStartupStuff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanUpStuff ");
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
