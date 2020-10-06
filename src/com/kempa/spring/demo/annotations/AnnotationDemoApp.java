package com.kempa.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// -----Test Default Bean ID----- //
		
		// get the bean (Default beanId) from spring container
		Coach thisCoach = context.getBean("testDefaultBeanID", Coach.class);
		// Calling default beanId methods
		System.out.println(thisCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
