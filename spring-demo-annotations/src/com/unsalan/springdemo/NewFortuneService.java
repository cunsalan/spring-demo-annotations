package com.unsalan.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewFortuneService implements FortuneService {
	
	@Value("${foo.fortuneNew}")
	private String fortuneNew;
	
	@Value("${foo.fortuneOld}")
	private String fortuneOld;
	
	@Value("${foo.fortuneBest}")
	private String fortuneBest;
	
	private String[] data = new String[3];
	
	public String getFortuneNew() {
		return fortuneNew;
	}

	public void setFortuneNew(String fortuneNew) {
		System.out.println("setFortuneNew");
		this.fortuneNew = fortuneNew;
	}

	public String getFortuneOld() {
		return fortuneOld;
	}

	public void setFortuneOld(String fortuneOld) {
		this.fortuneOld = fortuneOld;
	}

	@Override
	public String getFortuneBest() {
		return fortuneBest;
	}

	public void setFortuneBest(String fortuneBest) {
		this.fortuneBest = fortuneBest;
	}

	Random myRandom = new Random();
	
	public NewFortuneService() {
		
	}

	@PostConstruct
	public void setFortuneDatas() {
		data[0] = getFortuneNew();
		data[1] = getFortuneOld();
		data[2] = getFortuneBest(); 			
	}
	
	
	@Override
	public String getFortune() {
		System.out.println("getFortune init");
		int index = myRandom.nextInt(3);
		// TODO Auto-generated method stub
		return data[index];
	}

}
