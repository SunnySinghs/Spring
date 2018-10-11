package com.sourabh.springTutorials;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class DrawingApp {

	public static void main(String[] args) {
		//Resource rs = new ClassPathResource("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(rs);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springTutorialsApplicationContext.xml");
		//context.registerShutdownHook();
		/*Triangle tr = (Triangle) context.getBean("triangle");
		tr.draw();
		Vehicle vc = (Vehicle) context.getBean("vehicle-alias");
		vc.print();
		
		Rectangle rect = context.getBean("rectangle",Rectangle.class);
		rect.draw();
		
		Line line = context.getBean("line",Line.class);
		line.draw();
		
		Pentagon pent = context.getBean("pentagon",Pentagon.class);
		pent.getRect().draw();
		
		Shape shape = context.getBean("shape",Shape.class);
		shape.draw();
		
		Square squ = context.getBean("square", Square.class);
		squ.draw();*/
		
		Circle circle = context.getBean("circle",Circle.class);
		circle.draw();
		
		System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
		context.close();
	}
}
