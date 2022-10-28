package com.cybage.exception;


//Checked Exception Demo

public class ThrowDemo
{
	public static void demo3() 
	{
		System.out.println("Inside Demo3");
		try {
		int a=10/0;
		System.out.println("a="+a);
//		throw new NullPointerException();
	}
	
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	public static void demo2 () 
	{
		demo3();
		
	}
	public static void demo1()
	{
		demo2();
	}
	
	public static void main(String[] args) {
	
		demo3(); 
//		try {
//			demo3();
//	throw new NullPointerException();
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//	catch(NullPointerException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("After catch");	
	}
}
