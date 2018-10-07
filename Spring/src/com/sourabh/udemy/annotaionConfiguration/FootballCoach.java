package com.sourabh.udemy.annotaionConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	FortuneService fortuneService;
	
	/* As of Spring Framework 4.3, an @Autowired annotation on such a constructor
	is no longer if target bean only defines one constructor to begin with. 
	However, if several constructors are available, at least one 
	must be annotated to teach the container which one to use.*/
	public FootballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practice your long shot.";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it, "+fortuneService.getFortune();
	}
}
