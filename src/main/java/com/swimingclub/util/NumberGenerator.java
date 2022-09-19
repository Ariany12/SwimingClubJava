package com.swimingclub.util;

import java.util.Random;


public abstract class NumberGenerator {
	
	private static int [] level = {1, 2, 3, 4};
	private static int [] level1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


	public static int numberGenerator() {
		
		Random random = new Random();
		return level[random.nextInt(level.length)];
	}
	
	public static int numberGeneratorGroups() {
		
		Random random = new Random();
		return level1[random.nextInt(level1.length)];
	}
	

	public static void main(String[] args) {
		
		System.out.println(numberGenerator());
		System.out.println(numberGeneratorGroups());
		

	}

}

