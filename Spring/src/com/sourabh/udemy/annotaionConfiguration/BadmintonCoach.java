package com.sourabh.udemy.annotaionConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	@Override
	public String getDailyWorkOut() {
		return "Try down upward shot.";
	}

	@Override
	public String getDailyFortune() {
		return "Great, "+fortuneService.getFortune();
	}

}
