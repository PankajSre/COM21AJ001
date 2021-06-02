package com.cts.core.basics;

import java.util.Scanner;

public class Calculator {


	public  int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		Calculator cal3 = new Calculator();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first Number : ");
		int firstNumber = in.nextInt();
		System.out.print("Enter second Number : ");
		int secondNumber = in.nextInt();
		
//		System.out.println("Sum : " + sum);
		
	}
}
