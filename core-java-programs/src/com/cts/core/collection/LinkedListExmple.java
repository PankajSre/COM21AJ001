package com.cts.core.collection;

import java.util.LinkedList;

public class LinkedListExmple {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();
		names.addLast("Pankaj");
		names.add("SaiKumar");
		names.add("Gayatri");
		names.add("John");
		names.add("Reshma");
		names.add("Karthika");
		names.addFirst("Dattatreya");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
		
		
	}

}
