package com.cts.core.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHshSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(222);
		set.add(444);
		set.add(100);
		set.add(555);
		set.add(333);
		set.add(333);
		set.add(666);
		
		System.out.println(set);
	}
}
