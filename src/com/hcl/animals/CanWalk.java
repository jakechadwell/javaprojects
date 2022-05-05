package com.hcl.animals;

public interface CanWalk {
	
	default void walk() {
		System.out.println("I can walk");
	}
	
}
