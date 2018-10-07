package com.sourabh.udemy.annotaionConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RaceCoach implements Coach {

	FortuneService fortuneService;
	
	@Autowired
	@Qualifier("happyFortuneService") 
	void doSetFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "Run 100 meters.";
	}

	@Override
	public String getDailyFortune() {
		return "You got it, "+fortuneService.getFortune();
	}

}
