package com.sourabh.udemy.XMLConfiguration;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public BaseBallCoach() {
		
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
