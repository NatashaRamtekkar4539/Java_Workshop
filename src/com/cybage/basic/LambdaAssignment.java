package com.cybage.basic;

interface MathOperations1{
	
	public int add(int n1,int n2); 
}

public class LambdaAssignment {

	public static void main(String[] args) {
		
		MathOperations1 m = (n1,n2)->(n1+n2);
//		int sum =m.add(10,20);
			System.out.println("Addition is:"+m.add(4,5));
		}
	}


