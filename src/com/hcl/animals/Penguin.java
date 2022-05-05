package com.hcl.animals;

public class Penguin extends Bird implements CanWalk, CanSwim{

	@Override
	public void makeNoise() {
		System.out.println("Squawk");		
	}

	@Override
	public void flapWings() {
		System.out.println("*Flapping Wings...*");		
	}

}
