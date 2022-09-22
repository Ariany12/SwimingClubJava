package com.swimingclub.coachingstaff;

import java.util.HashMap;

import com.swimingclub.CoachingStaff;

public class SwimTeacher extends CoachingStaff {
	
	private HashMap<String, Integer> calendar;

	public SwimTeacher(String name, int qualificationNumber) {
		super(name, qualificationNumber);
		this.calendar = new HashMap<String, Integer>();
	
	}

	public int numberOfGroupsByDay(String day) {
		return calendar.get(day);
		
	}
	
	public void addGroup(String day) {
		int count = calendar.get(day);
		calendar.put(day, count + 1);
		
	}

}
