package com.cts.core.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Orange");
		list.add("Papaya");
		
		ListIterator lit = list.listIterator();
		
		System.out.println("*******Forward Direction********");
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println("*******Backward Direction********");
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
