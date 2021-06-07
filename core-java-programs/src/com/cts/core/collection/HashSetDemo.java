package com.cts.core.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(222);
		set.add(333);
		set.add(333);
		set.add(444);
		set.add(100);
		set.add(555);
		set.add(666);
		
		System.out.println(set);
		
	}

}
