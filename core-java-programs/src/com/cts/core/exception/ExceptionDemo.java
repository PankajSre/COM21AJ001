package com.cts.core.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Start the Program");
		int num = Integer.parseInt(args[0]);
		System.out.println("Value Accepted for the num");
		int div = 10 / (10 - num);
		System.out.println("The Division is : " + div);
		String name = "Sai";
		name = null;
		System.out.println("The Length of Name is : " + name.length());
		System.out.println("End of the Program");

	}

}
