package com.sourabh.udemy.XMLConfiguration;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
	}
	@Override
	public String getDailyWorkOut() {
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff() {
		System.out.println("Intializing Resorces.");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("Destroying Resorces.");
	}
}
