package com.cts.core.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		list.add(123);
//		list.add("Hello");
		list.add(2345);
		
		for (Integer obj : list) {
			Integer i = obj;
			System.out.println(i);
		}
	}

}
