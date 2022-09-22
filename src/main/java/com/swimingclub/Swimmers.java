package com.swimingclub;

public class Swimmers {
	
	private String name;
	private int age;
	private SwimmingGroups swimmingGroup;
	private int id;
	private static int NEXTID = 1;
	
	
	
	public Swimmers(String name, int age, SwimmingGroups swimmingGroup) {
		super();
		this.name = name;
		this.age = age;
		this.swimmingGroup = swimmingGroup;
		this.id = NEXTID;
		
		NEXTID++;
	
	}

	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

	public SwimmingGroups getswimmingGroupp() {
		return swimmingGroup;
	}


}

