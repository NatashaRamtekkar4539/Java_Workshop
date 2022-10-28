package com.cybage.basic;

public class Assignment 

{
	 static int count=0;
	 
	public static void main(String args[])
	{
			
		Assignment assi1=new Assignment();
		Assignment.count();
		Assignment assi2=new Assignment();
		Assignment.count();
		Assignment aassi3=new Assignment();
		Assignment.count();
		
		System.out.println("Total NUmber of Object Created: "+count);	
	}

	static void count()
	{
		count++;
	}	
}



