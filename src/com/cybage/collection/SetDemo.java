package com.cybage.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> numSet=new TreeSet<Integer>();  // TreeSet stores the data in sorted form
//		Set<Integer> numSet=new HashSet<Integer>(); 
		
		numSet.add(23);
		numSet.add(67);
		numSet.add(89);
		numSet.add(23);	
		numSet.add(12);
		System.out.println(numSet);
	}

}
