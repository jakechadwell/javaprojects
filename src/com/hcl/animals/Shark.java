package com.hcl.animals;

public class Shark extends Fish implements CanSwim{

	@Override
	public void makeNoise() {
		System.out.println("Grrrr");
	}

	@Override
	public void swimFoward() {
		System.out.println("*Swimming Foward...*");
	}	

}
