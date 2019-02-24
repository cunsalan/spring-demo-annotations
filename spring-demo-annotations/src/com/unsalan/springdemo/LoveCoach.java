package com.unsalan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LoveCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "make love on a daily bases";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "";
	}

}
