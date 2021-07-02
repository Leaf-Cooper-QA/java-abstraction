package com.qa.abstractionexercise;

public abstract class Mammal extends Animal{
	
	private int legNumber;
	
	
	
	public Mammal() {
		super();
	}



	public Mammal(int age, String name, String colour, int legNumber) {
		super(age, name, colour);
		this.setLegNumber(legNumber);
	}



	@Override
	public void makeNoise() {
		System.out.println("Misc animal noises");
	}



	public int getLegNumber() {
		return legNumber;
	}



	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}

}
