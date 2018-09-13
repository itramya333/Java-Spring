package com.coach;

public class BaseballCoach implements coach{
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout()
	{
		return "Hello Baseball";
	}

	@Override
	public String getDailyFortune() {
		
		return "Good day!!" + fortuneService.getFortune();
	}
}
