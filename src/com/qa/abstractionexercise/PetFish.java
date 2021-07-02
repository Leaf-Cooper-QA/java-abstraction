package com.qa.abstractionexercise;

public class PetFish extends Fish{
	
	private String location;

	
	
	
	public PetFish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PetFish(int age, String name, String colour, String species, String location) {
		super(age, name, colour, species);
		this.location=location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
