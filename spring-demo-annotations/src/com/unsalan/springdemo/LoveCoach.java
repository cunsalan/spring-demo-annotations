package com.unsalan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LoveCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "make love on a daily bases";
	}

	@Override
	public FortuneService getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService;
	}

}
