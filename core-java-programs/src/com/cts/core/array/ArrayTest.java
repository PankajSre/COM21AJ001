package com.cts.core.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayTest {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number Students Placed in CSE");
		int cse = Integer.parseInt(br.readLine());
		System.out.println(cse);
	}
}
