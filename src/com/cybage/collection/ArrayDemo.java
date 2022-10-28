package com.cybage.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		Integer arr[]= {1,3,5,7,9,8,2,6,4};
//		List<Iteger> list=Arrays.asList(3,4,5,6,6);
		List<Integer> numList= Arrays.asList(arr);
		System.out.println(numList);
//		Collections.sort(numList);
//		System.out.println(numList);
		
		Arrays.sort(arr);
		System.out.println(numList);
		
		
		System.out.println(numList.contains(5));
		
		Arrays.sort(arr);
		for(int n:arr)
			System.out.println(n);
		
				
	

		

	}
}
