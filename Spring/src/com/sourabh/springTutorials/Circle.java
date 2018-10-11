package com.sourabh.springTutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

public class Circle implements ApplicationEventPublisherAware{
	Points center;
	@Autowired
	MessageSource messageSource;
	ApplicationEventPublisher publisher;

	public Points getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Points center) {
		this.center = center;
	}

	void draw() {
		//System.out.println("Circle center is:"+center.getX()+","+center.getY());
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()}, "Default Greeting", null));
		publisher.publishEvent(new DrawEvent(this));
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
