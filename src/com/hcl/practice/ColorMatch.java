package com.hcl.practice;
import java.util.*;

public class ColorMatch {
	
	public static void main(String[] args) {
		String[] colorNames  =    {"red", "blue", "green", "yellow"};
		String[] colorNames1  = {"red", "green", "green", "green"};
		String[] colorNames2  = {"red", "blue", "green", "yellow"};
		
		System.out.println(duplicateCount(colorNames, colorNames1, colorNames2));
	}
	
	private static int duplicateCount(String[] colorNames1, String[] colorNames2, String[] colorNames3) {
		int count = 0;
		for(int i = 0; i < colorNames1.length; i++) {
			if(colorNames1[i] == colorNames2[i] && colorNames1[i] == colorNames3[i]) {
				count++;
			}
		}
		return count;
	}
	
}
