package com.swimingclub;

public abstract class ClubStaff {
	
	private static int NEXTID = 1;
	private String name;
	private int id;
	
	
	public ClubStaff(String name) {
		this.name = name;
		this.id = NEXTID;
		
		NEXTID++;
	}


	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	



	@Override
	public String toString() {
	return null;
		/* return "Clubstaff [name=" + name + ", id=" + id + ", role=" + role + "]";*/
	}
	
	
	
	
	
	

}
