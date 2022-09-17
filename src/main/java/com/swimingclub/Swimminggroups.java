package com.swimingclub;

public class Swimminggroups {
	
	private String identifier;
	private int swimmer;
	
	
	public Swimminggroups(String identifier, int swimmer) {
		super();
		this.identifier = identifier;
		this.swimmer = swimmer;
	}


	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


	public int getSwimmer() {
		return swimmer;
	}

	public void setSwimmer(int swimmer) {
		this.swimmer = swimmer;
	}
	
	
	

}
