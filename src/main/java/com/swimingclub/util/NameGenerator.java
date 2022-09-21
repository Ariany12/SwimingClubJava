package com.swimingclub.util;

import java.util.Random;

public abstract class NameGenerator {
	
	private static  String [] firstname = {"Marhta", "Cheron", "Crystal", "Travis", "Channel", "Jeremy"};
	private static  String [] lastname = {"Maciel", "Colon", "Scott", "Mendes", "Lane", "Morrissy"};
	
	public static String nameGenerator() {
		
		Random random = new Random();
		return firstname[random.nextInt(firstname.length)] + " " +  lastname[random.nextInt(lastname.length)] ;	
		
	}
	
	/*public static void main(String[] args) {
		
		System.out.println(nameGenerator());
		
	}
	*/

}
