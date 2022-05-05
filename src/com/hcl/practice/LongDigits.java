package com.hcl.practice;

public class LongDigits {

	public static int digitsCount(long n) {
		if( n/10 == 0 ){
			return 1;
		}
		else{
			return 1 + (digitsCount( n/10 ));
		}
}
	
	public static void main(String[] args) {
		System.out.println(digitsCount(0));
		System.out.println(digitsCount(-12003));
		System.out.println(digitsCount(12003435));
		System.out.println(digitsCount(3));
	}

}
