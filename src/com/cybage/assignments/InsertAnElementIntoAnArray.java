package com.cybage.assignments;

import java.util.Scanner;

public class InsertAnElementIntoAnArray {

	public static void main(String[] args) {
		int i, tot;
		Scanner scan = new Scanner(System.in);     
		System.out.print("Enter the Size of Array: ");
		int n = scan.nextInt();
		int[] arr = new int[n+1];
		System.out.print("Enter " +n+ " Elements: ");
		for(i=0; i<n; i++)
		arr[i] = scan.nextInt();
		      
		System.out.print("Enter an Element to Insert: ");
		int element = scan.nextInt();
		System.out.print("At what position ? ");
		int pos = scan.nextInt();
		      
		if(pos<n) {
			for(i=n; i>=pos; i--)
		    arr[i] = arr[i-1];
		    arr[i] = element;
		    System.out.println("\nNow the new array is: ");
		    
		    for(i=0; i<(n+1); i++)
		    System.out.print(arr[i]+ " ");
		}
		      
		else
		System.out.println("\nInvalid Input!");
	}
}

