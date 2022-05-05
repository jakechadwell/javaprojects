package com.hcl.animals;

public class Dolphin extends Mammal implements CanSwim{

	@Override
	public void makeMilk() {
		System.out.println("*Making Milk...*");
	}

	@Override
	public void makeNoise() {
		System.out.println("Squeak Squeak");
	}

}
