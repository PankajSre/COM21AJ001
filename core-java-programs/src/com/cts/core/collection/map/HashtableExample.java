package com.cts.core.collection.map;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashtableExample {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		
		hashtable.put("Apple", 250);
		hashtable.put("Banana", 50);
		hashtable.put("Mango", 80);
		hashtable.put("Orange", 150);
		hashtable.put("Apple", 350);
		hashtable.put("Papaya", null);
//		hashtable.put(null, 40);
		
		for(Entry<String, Integer> entry: hashtable.entrySet()) {
			System.out.println(entry.getKey()+ " ==> "+ entry.getValue());
		}
	}
}
