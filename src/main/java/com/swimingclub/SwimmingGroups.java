package com.swimingclub;

public class SwimmingGroups {
	
	private String name;
	private String identifier;
	private int swimmer;
	private String day;
	
	
	public SwimmingGroups(String identifier, int swimmer) {
		super();
		this.identifier = identifier;
		this.swimmer = swimmer;
	}


	
	public String getIdentifier() {
		return identifier;
	}
	


	public int getSwimmer() {
		return swimmer;
	}

	public void setSwimmer(int swimmer) {
		this.swimmer = swimmer;
	}
	
	
	

}
