package com.sourabh.udemy.annotaionConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		//component bean id, Constructor injection with @autoWired
		Coach theCoach = context.getBean("theSillyCoach",Coach.class);  
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//default bean id, Constructor injection without @autoWired. see explanation in FootballCoach bean
		theCoach = context.getBean("footballCoach", Coach.class);  
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//default bean id, setter injection
		theCoach = context.getBean("hockeyCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//default bean id, method injection
		theCoach = context.getBean("raceCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//default bean id, field injection
		theCoach = context.getBean("badmintonCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
			
		//default bean id, field injection, inject value from property file
		SwimCoach alphaCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(alphaCoach.getDailyWorkOut());
		System.out.println(alphaCoach.getDailyFortune());
		System.out.println(alphaCoach.getEmailId());
		System.out.println(alphaCoach.getTeam());
		
		context.close();
	}

}
	