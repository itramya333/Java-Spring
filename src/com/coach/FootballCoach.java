package com.coach;

public class FootballCoach implements coach {

	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Hello Football";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
