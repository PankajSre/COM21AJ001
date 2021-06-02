package com.cts.core.basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		String firstName = in.nextLine();
		System.out.print("Enter last Name : ");
		String lastName = in.nextLine();
		
		String fullName = firstName +" " +lastName;
		System.out.println(fullName);
		
	}
}
