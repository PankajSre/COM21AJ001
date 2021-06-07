package com.cts.core.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Karthika");
		treeSet.add("SaiKumar");
		treeSet.add("john");
		treeSet.add("2001");
		treeSet.add("Reshma");
		treeSet.add("Gayatri");
		
		for(String name: treeSet) {
			System.out.println(name);
		}
	}

}
