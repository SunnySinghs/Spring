package com.sourabh.springTutorials;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
		
	}

}
