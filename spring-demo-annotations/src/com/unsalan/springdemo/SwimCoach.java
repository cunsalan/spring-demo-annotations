package com.unsalan.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService =  theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "swim 1000 meters as a warm up";
	}

	@Override
	public FortuneService getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService;
	}

}
