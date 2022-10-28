package com.cybage.basic;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] intArray=new int[10];
		
		intArray[0]=10;
		intArray[1]=20;
		
		int[] newArray= {4,6,8,2,4,6};
		
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
			
		System.out.println();
		
		//for each :-
		
		for(int element:newArray)
		{
			System.out.println(element);
		}
	}
}
