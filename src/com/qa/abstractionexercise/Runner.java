package com.qa.abstractionexercise;

public class Runner {
	public static void main(String[] args) {
		
//		Animal a = new Animal();
//		a.makeNoise();
		
		Horse horse = new Horse(6,"Lord Horsington","Brown",4,"Some bloke");
		horse.makeNoise();
		horse.walk();
		
		Fish petFish = new PetFish(2,"Goldilocks","Blue","Salmon","main tank");
		petFish.makeNoise();
		petFish.swim();
		
		Otter otter = new Otter(10,"Oliver","Brown",4,true);
		otter.makeNoise();
		otter.swim();
		otter.walk();
		
		Dolphin dolphin = new Dolphin(12,"Dotty","Grey",0,95);
		dolphin.makeNoise();
		dolphin.swim();
	}

}
