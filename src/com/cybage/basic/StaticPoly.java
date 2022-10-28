package com.cybage.basic;

class AddDemo
{
//	Method Overloading :-
	
	int add(int n1,int n2)
	{
		System.out.println("add int");
		return n1+n2;
	}
	
	float add(float n1,float n2)
	{
		System.out.println("add float");
		return n1+n2;
	}
	
	double add(double n1,double n2)
	{
		System.out.println("add double");
		return n1+n2;
	}
	
	byte add(byte n1,byte n2)
	{
		System.out.println("add byte");
		return (byte)(n1+n2);
	}
	
	short add(short n1,short n2)
	{
		System.out.println("add short");
		return (short)(n1+n2);
	}
	
	long add(long n1,long n2)
	{
		System.out.println("add long");
		return (long)(n1+n2);
	}
	
	long add(short n1,long n2)
	{
		System.out.println("add long + short");
		return (long)(n1+n2);
	}
}

public class StaticPoly {
	
	public static void main(String[] args) {
		AddDemo addDemo=new AddDemo();
		System.out.println(addDemo.add(20,30));
		
		System.out.println(addDemo.add(20.4,30.8));
		
		System.out.println(addDemo.add(20.4f,30.9));
		
		System.out.println(addDemo.add(20.4f,30.9f));
		
		System.out.println(addDemo.add((byte)30,(byte)50));
		
		System.out.println(addDemo.add((short)30,(short)80));
		
		System.out.println(addDemo.add((long)100,(long)180));
		
		System.out.println(addDemo.add((short)10,(long)80));
	}
}
