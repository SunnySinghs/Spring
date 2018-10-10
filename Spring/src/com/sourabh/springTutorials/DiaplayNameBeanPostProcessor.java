package com.sourabh.springTutorials;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DiaplayNameBeanPostProcessor implements BeanPostProcessor, Ordered{

	int order;
	
	@Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
		System.out.println("postProcessBeforeInitialization Bean Name: "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
    	System.out.println("postProcessAfterInitialization Bean Name: "+beanName);
        return bean;
    }

    public void setOrder(int order) {
    	this.order = order;
    }
	@Override
	public int getOrder() {
		return 0;
	}
}
