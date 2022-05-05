package com.hcl.animals;
import java.util.*;

public class AnimalMain {

	public static void main(String[] args) {
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Eagle());
		animalList.add(new Ostrich());
		animalList.add(new Penguin());
		animalList.add(new FlyingFish());
		animalList.add(new Shark());
		animalList.add(new Bat());
		animalList.add(new Dolphin());
		animalList.add(new Human());
		
		for(Animal animal: animalList) {
			animal.makeNoise();
			
			if(animal instanceof CanFly) {
				((CanFly) animal).fly();
			}
			if(animal instanceof CanWalk) {
				((CanWalk) animal).walk();
			}
			if(animal instanceof CanSwim) {
				((CanSwim) animal).swim();
			}
		}
	}

}
