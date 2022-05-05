package com.hcl.animals;

public interface CanFly {
	
	default void fly() {
		System.out.println("I can fly");
	}
	
}
