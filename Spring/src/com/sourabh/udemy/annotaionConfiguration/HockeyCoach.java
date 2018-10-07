package com.sourabh.udemy.annotaionConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	FortuneService fortuneService;
	
	@Autowired
	public void setFortuneService(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "CenterForwrd try hook shot.";
	}

	@Override
	public String getDailyFortune() {
		return "You got your chance, "+fortuneService.getFortune();
	}

}
