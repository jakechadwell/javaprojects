package com.hcl.animals;

public class Eagle extends Bird implements CanFly{

	@Override
	public void makeNoise() {
		System.out.println("CAW");
	}

	@Override
	public void flapWings() {
		System.out.println("*Flapping Wings...*");
	}

}
