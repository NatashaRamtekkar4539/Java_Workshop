package com.cybage.basic;

class A
{
//	int m,n;
//	A(int m,int n)
//	{
//		this.m=m;
//		this.n=n;
//	}
	
	public void display()
	{
		System.out.println("class A's display method");
	}
}

class B extends A
{
//	int p;
//	B(int m,int n,int p)
//	{
//		super(m,n);
//		this.p=p;
//	}
	
//	@Override
	public void display()
	{
		System.out.println("class B's display method");
	}
}

public class PolyDemo {

	public static void main(String[] args)
	{
//		A a=new A();
//		a.display();
	
		B b=new B();
		b.display();
	
		A a1=new B();
		a1.display();
	}
}
