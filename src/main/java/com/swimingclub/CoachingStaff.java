package com.swimingclub;

public abstract class CoachingStaff {
	
	private String name;
	private int id;
	private int qualificationNumber;
	
	
	public CoachingStaff(String name, int id, int qualificationNumber) {
		super();
		this.name = name;
		this.id = id;
		this.qualificationNumber = qualificationNumber;
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

	public void setId(int id) {
		this.id = id;
	}

	public int getQualificationNumber() {
		return qualificationNumber;
	}

	public void setQualificationNumber(int qualificationNumber) {
		this.qualificationNumber = qualificationNumber;
	}



	@Override
	public String toString() {
		return "CoachingStaff [name=" + name + ", id=" + id + ", qualificationNumber=" + qualificationNumber + "]";
	}
	
	
}
	
	