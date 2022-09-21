package com.swimingclub.util;


import java.util.Random;

public abstract class GroupGenerator {
	
	private static  String [] groupGenerator = {"Dolphin", "Seals", "Turtles", "Sharks", "Whales"};
	
	 /*private static  String [] groupGenerator = {"Dolphin1", "Dolphin2", "Dolphin3" , "Dolphin4", "Dolphin5", "Dolphin6", "Dolphin7", "Dolphin8", "Dolphin9" , "Dolphin10",
			"Seals1", "Seals2", "Seals3","Seals4","Seals5","Seals6","Seals7","Seals8","Seals9", "Seals10", "Turtles1","Turtles2", "Turtles3", "Turtles4", "Turtles5","Turtles6",
			"Turtles7","Turtles8","Turtles9","Turtles10","Sharks1", "Sharks2","Sharks3","Sharks4","Sharks5","Sharks6","Sharks7","Sharks8","Sharks9","Sharks10",
			"Whales1", "Whales2", "Whales3","Whales4","Whales5","Whales6","Whales7","Whales8","Whales9", "Whales10"};
	
	*/
	
	public static String groupGenerator() {
		
		Random random = new Random();
		return groupGenerator[random.nextInt(groupGenerator.length)] ;	
		
	}
	
	public static void main(String[] args) {
			
		System.out.println(groupGenerator());
	}
}
