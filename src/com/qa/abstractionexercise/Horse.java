package com.qa.abstractionexercise;

public class Horse extends Mammal implements WalkBehaviour{
	
	private String owner;
	
	
	
	public Horse() {
		super();
	}

	public Horse(int age, String name, String colour, int legNumber, String owner) {
		super(age, name, colour, legNumber);
		this.owner = owner;
	}

	@Override
	public void makeNoise() {
		System.out.println("Neigh!");
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public void walk() {
		System.out.println("The horse gallops around the field");
		
	}

}
