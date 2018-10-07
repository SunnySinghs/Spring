package com.sourabh.udemy.annotaionConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	private String emailId;
	private String team;
	
	public String getEmailId() {
		return emailId;
	}
	@Value("${foo.email}")
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTeam() {
		return team;
	}
	@Value("${foo.team}")
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		return "Swim daily about 30 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return "Wallah! "+fortuneService.getFortune();
	}

}
