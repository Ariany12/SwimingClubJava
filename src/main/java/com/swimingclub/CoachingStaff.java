package com.swimingclub;

public abstract class CoachingStaff {
	
	private String name;
	private static int NEXTID = 1;
	private int id;
	private int qualificationNumber;
	
	
	public CoachingStaff(String name, int qualificationNumber) {
		super();
		this.name = name;
		this.qualificationNumber = qualificationNumber;
		this.id = NEXTID;
		
		NEXTID++;
	}

	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getNEXTID() {
		return NEXTID;
	}

	public int getQualificationNumber() {
		return qualificationNumber;
	}

	public void setQualificationNumber(int qualificationNumber) {
		this.qualificationNumber = qualificationNumber;
	}

	@Override
	public String toString() {
		return "CoachingStaff [name=" + name + ", qualificationNumber=" + qualificationNumber + "]";
	}



	
}


	