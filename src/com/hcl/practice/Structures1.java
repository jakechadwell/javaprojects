package com.hcl.practice;

public class Structures1 {

	public static void main(String[] args) {
//		Item anItem = new Item("Frosty Crunches", 250, 28);
//		
//		Item anotherItem = new Item("Generic Cereal", 500, 56);
//		
//		System.out.println(anItem.name);
//		System.out.println(anotherItem.name);
		
		double x = 4;
		short y = 4;
		
		if (x==y) {
			System.out.println("x equals y.");	
		}else {
			System.out.println("x does not equal y.");
		}
		
		Item newItem = new Item();
		Item newItem2 = newItem;
		System.out.println(newItem.equals(newItem2));
	}

}
