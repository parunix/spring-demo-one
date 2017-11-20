package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService=theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "practice 30 minut";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get Fortune
		return fortuneService.getFortune();
	}
	
}
