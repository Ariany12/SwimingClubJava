package com.swimingclub;

import com.swimingclub.coachingstaff.SwimTeacher;

public class SwimmingGroups {
	
	private String name;
	private int swimmer;
	private String day;
	private SwimTeacher swimTeacher;
	
	

	
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


	public String getDay() {
		return day;
	}

		
	public SwimTeacher getswimTeachery() {
		return swimTeacher;
	}


	public void setSwimTeacher(SwimTeacher swimTeacher) {
		this.swimTeacher = swimTeacher;
	}

	

}
