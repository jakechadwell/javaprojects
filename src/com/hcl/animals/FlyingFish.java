package com.hcl.animals;

public class FlyingFish extends Fish implements CanFly, CanSwim{

	@Override
	public void makeNoise() {
		System.out.println("Splash Splash");
	}

	@Override
	public void swimFoward() {
		System.out.println("*Swimming Foward...*");
	}

}
