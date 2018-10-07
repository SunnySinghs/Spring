package com.sourabh.springTutorials;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class DrawingApp {

	public static void main(String[] args) {
		//Resource rs = new ClassPathResource("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(rs);
		ApplicationContext context = new ClassPathXmlApplicationContext("springTutorialsApplicationContext.xml");
		Triangle tr = (Triangle) context.getBean("triangle");
		tr.draw();
		Vehicle vc = (Vehicle) context.getBean("vehicle");
		vc.print();
	}
}
