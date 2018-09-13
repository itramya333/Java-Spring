package com.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		//Retreive the Bean from Spring container
		
		coach theCoach = context.getBean("myCoach", coach.class);// id and interface

		//Call the Bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//Close the context
		context.close();
	}

}
