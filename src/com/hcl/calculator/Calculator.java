package com.hcl.calculator;
import java.util.*;

public class Calculator {
	
	public static void main(String[] args) {
		boolean cont = true;
		do {
			try {
				Scanner scanner = new Scanner(System.in);
				int num1, num2;
				String operator;
				int result = 0;
				System.out.println("Please enter first number:");
				num1 = scanner.nextInt();
				System.out.println("Great! Now an operator (+, -, x, /, %, ^): ");
				operator = scanner.next();
				System.out.println("And finally, second number: ");
				num2 = scanner.nextInt();
				
				if(operator.equals("+")) {
					result = num1+num2;
				}else if(operator.equals("-")) {
					result = num1-num2;
				}else if(operator.equals("x")) {
					result = num1*num2;
				}else if(operator.equals("/")) {
					result = num1/num2;
				}else if(operator.equals("%")) {
					result = num1%num2;
				}else if(operator.equals("^")) {
					result = (int) Math.pow(num1, num2);
				}else {
					throw new Exception();
				}
				
				System.out.println("Here is the result: " + result);
				System.out.println("Would you like to continue? (y/n)");
				String input = scanner.next();
				cont = true;
				if(input.equalsIgnoreCase("y")) {
					continue;
				}else {
					scanner.close();
					cont = false;
					break;
				}
			} catch(Exception e) {
				System.out.println("That is invalid syntax, try again");
			}
			
		} while(cont);
	}
	
}
