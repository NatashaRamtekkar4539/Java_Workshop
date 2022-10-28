package com.cybage.basic;

interface MathOperations
{
	float PI=3.14F;
	
	
	public void add(int n1,int n2);
	public void sub(int n1,int n2);
	public void mul(int n1,int n2);
	public void div(int n1,int n2);
	
	//default method jdk1.8 version introduced it
	
	default void multiplication(int n1,int n2)
	{
		System.out.println("Multiplication: "+(n1*n2));
	}
	
	default void division(int n1,int n2)
	{
		System.out.println("Division: "+(n1/n2));
	}
	
	static void greet()
	{
		System.out.println("Hello Good Morning :)");
	}
}

class Calculator implements MathOperations
{
	@Override
	public void add(int n1, int n2) {
	System.out.println("Add="+(n1+n2));	
	}
	@Override
	public void sub(int n1, int n2) {
	System.out.println("Sub="+(n1-n2));	
	}
	@Override
	public void mul(int n1, int n2) {
	System.out.println("Mul="+(n1*n2));	
	}
	@Override
	public void div(int n1, int n2) {
	System.out.println("Div="+(n1/n2));	
	}
	@Override
	public void multiplication(int n1, int n2) {
	System.out.println("Multiplication in Sub-class");	//override multiplication of default method of interface
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.add(30, 49);
		
		
		//reference variable of interface and assigning to implementing class
		
		MathOperations mOperations=new Calculator();
		mOperations.add(10,20);
		
		mOperations.multiplication(4, 4); //default method
		
		mOperations.division(4, 4); //default method
		
		MathOperations mOperations1=new Calculator();
		mOperations1.sub(10,20);
		MathOperations mOperations2=new Calculator();
		mOperations2.mul(10,20);
		MathOperations mOperations4=new Calculator();
		mOperations4.div(10,20);
		
		System.out.println(MathOperations.PI);
		
		MathOperations.greet();
		
	
	}
}
