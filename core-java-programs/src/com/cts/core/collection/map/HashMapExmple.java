package com.cts.core.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapExmple {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Apple", 250);
		map.put("Banana", 50);
		map.put("Mango", 80);
		map.put("Orange", 150);
		map.put("Apple", 350);
		map.put("Papaya", 40);
		map.put(null, 00);
		
	
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " ==> "+ entry.getValue());
		}
	}

}
