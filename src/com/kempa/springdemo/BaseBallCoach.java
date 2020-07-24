package com.kempa.springdemo;

public class BaseBallCoach implements Coach{
	
	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes on bating practice";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
