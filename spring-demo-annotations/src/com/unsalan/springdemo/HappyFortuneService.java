package com.unsalan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!";
	}

	@Override
	public String getFortuneBest() {
		// TODO Auto-generated method stub
		return null;
	}

}

