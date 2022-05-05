package com.hcl.animals;

public class Bat extends Mammal implements CanFly{
	
	@Override
	public void makeMilk() {
		System.out.println("*Making Milk...*");
	}

	@Override
	public void makeNoise() {
		System.out.println("Screech");
	}

}
