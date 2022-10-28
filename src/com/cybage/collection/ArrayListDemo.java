package com.cybage.collection;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> nameList=new ArrayList<>();
		

		System.out.println(nameList.size());
		nameList.add("Natasha");
		nameList.add("Richa");
		nameList.add("Ruhi");
		nameList.add("Ruhi");
		nameList.add("Ruhi");
		nameList.add("Karan");
//		nameList.add(null);
//		
//		Collections.sort(nameList);
		Collections.reverse(nameList);
		int count=Collections.frequency(nameList,"Karan");
		System.out.println(count);
		int count1=Collections.frequency(nameList,"Natasha");
		System.out.println(count1);
		
		
		//OLD APPROACH:
		
//		this is using traditional  for-each loop:
		
//		for(String name:nameList)
//			System.out.println(name);
		
		//Using Iterator:
		
//		Iterator<String> iterator=nameList.iterator();
//		while(iterator.hasNext()) {
//			String name=iterator.next();
//			System.out.println(name);
//		}
//s
		
//		
		
		//NEW APPROACH:
		//using forEach()-Method:
		
		nameList.forEach((name)->System.out.println(name)); //traverse the list
		
		
		
//		System.out.println(nameList.size());
//		System.out.println(nameList);
//		System.out.println(nameList.contains("Karan"));
//		nameList.remove("Karan");
//		System.out.println(nameList);
//		System.out.println(nameList.get(3));
//		nameList.set(3,"Sharan");
//		System.out.println(nameList);
//		int index=nameList.indexOf("Richa");
//		System.out.println("index of Richa "+index);
//		String names[]=(String[])nameList.toArray();
	}
}
