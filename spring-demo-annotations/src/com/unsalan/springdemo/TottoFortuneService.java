package com.unsalan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TottoFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "O my God You Have Won The Totte Lotery";
	}

	@Override
	public String getFortuneBest() {
		// TODO Auto-generated method stub
		return null;
	}

}
