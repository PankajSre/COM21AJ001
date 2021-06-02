package com.cts.core.array;

import java.util.Scanner;

public class UserInputInArray {
	public static void main(String[] args) {

		int[] marks;
		marks = new int[6];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		
		for(int i=0; i<marks.length ; i++) {
			System.out.print("Enter the "+(i+1)+ " th Element : ");
			marks[i] = in.nextInt();
		}
		
		System.out.println("\nThe Marks Entered by the User are : ");
		
		for(int i=0; i<marks.length ; i++) {
			System.out.println("The"+(i+1)+ " th Element : " + marks[i]);
			
		}
	}
}
