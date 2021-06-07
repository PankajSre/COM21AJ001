package com.cts.core.collection.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Apple", 250);
		map.put("Banana", 50);
		map.put("Mango", 80);
		map.put("Orange", 150);
		map.put("Apple", 350);
		map.put("Papaya", 40);
		
		
	
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " ==> "+ entry.getValue());
		}
	}
}
