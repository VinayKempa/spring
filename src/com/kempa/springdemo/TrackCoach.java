package com.kempa.springdemo;

public class TrackCoach implements Coach {
	
	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	public void doMyStatupStuff() {
		System.out.println("Inside Start Up method doMyStatupStuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("Inside Clean Up method doMyCleanUpStuff");
	}

}
