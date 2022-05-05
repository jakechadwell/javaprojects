package com.hcl.animals;

public class Ostrich extends Bird implements CanWalk{
	
	@Override
	public void makeNoise() {
		System.out.println("Ostrich Noise");
	}

	@Override
	public void flapWings() {
		System.out.println("*Flapping Wings...*");		
	}
	
}
