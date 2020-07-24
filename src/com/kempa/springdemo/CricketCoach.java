package com.kempa.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	private String teamHome;
	
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

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress with value = " + emailAddress);
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam with value = " + team);
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public String getTeamHome() {
		return teamHome;
	}

	public void setTeamHome(String teamHome) {
		System.out.println("CricketCoach: inside setter method - setTeamHome with value = " + teamHome);
		this.teamHome = teamHome;
	}

}
