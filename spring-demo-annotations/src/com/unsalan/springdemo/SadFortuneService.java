package com.unsalan.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is a sad day";
	}

	@Override
	public String getFortuneBest() {
		// TODO Auto-generated method stub
		return null;
	}

}
