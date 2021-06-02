package com.cts.core.basics;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int Pi = (22/7);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		int radius = sc.nextInt();
		System.out.print("Enter the height : ");
		int height = sc.nextInt();
		int volume = (((Pi*radius)^2)*height);
		System.out.print("Volume is = " + volume);

	}

}
