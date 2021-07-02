package com.qa.abstractionexercise;

public class Otter extends Mammal implements WalkBehaviour,SwimBehaviour{
	
	private Boolean cuteness;
	
	
	
	public Otter() {
		super();
	}

	public Otter(int age, String name, String colour, int legNumber, Boolean cuteness) {
		super(age, name, colour, legNumber);
		this.cuteness = cuteness;
	}

	@Override
	public void makeNoise() {
		System.out.println("I don't know what noise otters make");
	}

	public Boolean getCuteness() {
		return cuteness;
	}

	public void setCuteness(Boolean cuteness) {
		this.cuteness = cuteness;
	}

	@Override
	public void swim() {
		System.out.println("The otter swims along the river");
		
	}

	@Override
	public void walk() {
		System.out.println("The otter plods along");
		
	}

}
