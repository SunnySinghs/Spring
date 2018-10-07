package com.sourabh.udemy.XMLConfiguration;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailID;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg Constructor");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

}
