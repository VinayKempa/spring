package com.kempa.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Create a no-arg constructor
	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5 rounds outside the 30 yard circle";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes: " + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = theFortuneService;
	}

}
