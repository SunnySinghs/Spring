package com.sourabh.udemy.XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		Coach theCoach = context.getBean("theCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		context.close();
	}

}
