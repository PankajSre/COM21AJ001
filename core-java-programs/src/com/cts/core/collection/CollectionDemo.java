package com.cts.core.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {

		List list = new ArrayList();
//		ArrayList list = new ArrayList();

		System.out.println("is list empty ? : " + list.isEmpty());

		list.add(2021);
		list.add(2021);
		list.add("Hello");
		list.add("World");
		list.add(true);
		list.add(25.50);
		list.add(2021);
		
		System.out.println(list);
		System.out.println("is list empty ? : " + list.isEmpty());
		
		System.out.println("is test in the List? "+ list.contains("test"));
		
		
		System.out.println("remove Hello"+ list.remove(2));
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		ArrayList names = new ArrayList();
		
		names.add("John");
		names.add("Reshma");
		names.add("Karthika");
		names.add("Gayatri");
		
		list.addAll(names);
		System.out.println(list);
		// Traversing using for each loop
//		for(Object obj: list) {
//			System.out.println(obj);
//		}
//		list.clear();
//		System.out.println(list);
		
		
		// Traversing using Iterator interface
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Integer obj = (Integer)it.next();
			
			System.out.println(obj);
		}
	}

}
