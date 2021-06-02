package com.cts.core.basics;

import java.util.Scanner;

public class ReturnTypeDemo {
	// to check for even number[true,false]
	public static boolean isEvenNumber(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	
	public static void checkOddEvenNumber(int num) {
		if (num % 2 != 0) {
			System.out.println("The Number is Odd");
		}
		else {
			System.out.println("The Number is Even");
		}
		
	}

	public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the Number");
     int number = in.nextInt();
     
    boolean result = isEvenNumber(number);//false
    
    System.out.println("Is the Number is Even ? : "+ result);
    
    checkOddEvenNumber(number);
		
	}
}
