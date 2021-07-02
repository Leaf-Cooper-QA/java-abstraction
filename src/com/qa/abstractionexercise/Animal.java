package com.qa.abstractionexercise;

public abstract class Animal {
	
	private int age;
	private String name;
	private String colour;
	
	
	public Animal() {
		
	}
	
	public Animal(int age, String name, String colour) {
		super();
		this.age = age;
		this.name = name;
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public abstract void makeNoise(); 
	
	public void sleep() {
		System.out.println("zzzzzzzz");
	}
	
	

}
