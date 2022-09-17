package com.swimingclub;

public abstract class Clubstaff {
	
	private static int NEXTID = 1;
	
	public Clubstaff(String name) {
		this.name = name;
		this.id = NEXTID;
		
		NEXTID++;
	}



	private String name;
	private int id;
	
	
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
	return null;
		/* return "Clubstaff [name=" + name + ", id=" + id + ", role=" + role + "]";*/
	}
	
	
	
	
	
	

}
