package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create object
		Coach theCoach = new TrackCoach(null); //wskazuje na konkretna klase, nie jest konfigurowalne
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		

	}

}
