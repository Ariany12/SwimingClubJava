package com.swimingclub;

public class SwimmingGroups {
	
	private String name;
	private int swimmer;
	private String day;
	
	
	public SwimmingGroups(String name, int swimmer, String day) {
		super();
		this.name = name;
		this.swimmer = swimmer;
		this.day = day;
	}


	public String getName() {
		return name;
	}


	

	public int getSwimmer() {
		return swimmer;
	}


	public void setSwimmer(int swimmer) {
		this.swimmer = swimmer;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}
	
	
	


}
