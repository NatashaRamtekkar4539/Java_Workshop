package com.cybage.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
//	Map<Integer, String>map=new HashMap<Integer, String>();
	Map<Integer, String>map=new TreeMap<Integer, String>();
	map.put(1, "Natasha");
	map.put(3, "Richa");
	map.put(2, "Raja");
	map.put(5, "Natasha");
	map.put(4, "Riddhi");
	System.out.println(map);
	System.out.println(map.get(4));
	System.out.println("No. of elements "+map.size());
	map.remove(5);
	System.out.println(map);
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());

	}
}
