package com.kempa.spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class TestDefaultBeanID implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pointed to default bean reference and printing class name" + this.getClass().getName();
	}

}
