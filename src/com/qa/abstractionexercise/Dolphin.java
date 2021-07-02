package com.qa.abstractionexercise;

public class Dolphin extends Mammal implements SwimBehaviour{
	
	private int iq;
	
	
	
	public Dolphin() {
		super();

	}

	public Dolphin(int age, String name, String colour, int legNumber, int iq) {
		super(age, name, colour, legNumber);
		this.iq=iq;
	}

	@Override
	public void makeNoise() {
		System.out.println("So long and thanks for all the fish");
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	@Override
	public void swim() {
		System.out.println("The dolphin swims with its pod");
		
	}

}
