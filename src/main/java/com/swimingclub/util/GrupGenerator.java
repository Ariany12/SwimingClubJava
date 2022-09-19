package com.swimingclub.util;


import java.util.Random;

public abstract class GrupGenerator {
	
	private static  String [] grupGenerator = {"Dolphins", "Seals", "Turtles","Sharks", "Whales"};
	
	
	public static String grupGenerator() {
		
		Random random = new Random();
		return grupGenerator[random.nextInt(grupGenerator.length)] ;	
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(grupGenerator());
		
	}

}
