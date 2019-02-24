package com.unsalan.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {"Will rain","Need a good husban","Have a god day"};
	
	private Random myRandom = new Random();
 	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);		
		return data[index];
	}
	@Override
	public String getFortuneBest() {
		// TODO Auto-generated method stub
		return null;
	}

}
