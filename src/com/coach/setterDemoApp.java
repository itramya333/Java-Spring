package com.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		//Retreive the Bean from Spring container
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);// id and interface

		//Call the Bean
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
