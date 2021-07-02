package com.qa.abstractionexercise;

public class Fish extends Animal implements SwimBehaviour{
	
	private String species;
	
	
	
	public Fish() {
		super();

	}

	public Fish(int age, String name, String colour,String species) {
		super(age, name, colour);
		this.species = species;

	}

	@Override
	public void makeNoise() {
		System.out.println("Glub Glub");
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public void swim() {
		System.out.println("The fish swims swimmingly");
		
	}

}
