package com.swimingclub.util;

import java.util.Random;

public abstract class DayGenerator {

	
	private static  String [] day = {"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday"};
		
		
		public static String dayGenerator() {
			
			Random random = new Random();
			return day[random.nextInt(day.length)];	
			
		}
		
	public static void main(String[] args) {
			
			System.out.println(dayGenerator());
			
		}

}
