package com.hcl.animals;

public interface CanSwim {

	default void swim() {
		System.out.println("I can swim");
	}
	
}
