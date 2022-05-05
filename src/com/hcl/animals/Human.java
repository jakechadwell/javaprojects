package com.hcl.animals;

public class Human extends Mammal implements CanWalk, CanSwim{

	@Override
	public void makeMilk() {
		System.out.println("*Making Milk...*");
	}

	@Override
	public void makeNoise() {
		System.out.println("Hi there");
	}

}
