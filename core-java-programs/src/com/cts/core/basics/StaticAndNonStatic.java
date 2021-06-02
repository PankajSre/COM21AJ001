package com.cts.core.basics;

public class StaticAndNonStatic {

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

		StaticAndNonStatic s = new StaticAndNonStatic();
		System.out.println("The Addition is : " + s.add(2,3));
	}
}
