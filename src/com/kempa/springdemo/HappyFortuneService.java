package com.kempa.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] data = {
			"Data 1",
			"Data 2",
			"Data 3"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//return "Today is your lucky Day!!";
		return data[myRandom.nextInt(data.length)];
	}

}
