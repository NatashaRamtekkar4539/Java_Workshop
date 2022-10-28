package com.cybage.basic;

abstract class Shape
{
	int l,b;
	Shape(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
//	{
//		System.out.println("Can't define area for Shape");
//	}
}

class Rectangle extends Shape
{
	public Rectangle (int l ,int b) 
	{		
		super(l,b);
		System.out.println("Area of Rectangle:"+(l*b));
	}
}

class Triangle extends Shape
{
	public Triangle(int l, int b) 
	{
		super(l,b);
		System.out.println("Area of triangle:"+0.5*(l+b));
	}	
}

public class AbstractDemo {
	public static void main(String[] args) {
Shape shape=new Rectangle(10,40);
Shape shape1=new Triangle(6,6);

//		
//	shape.area();
//	
//	Shape shape1=new Triangle();
//	
//	shape1.area();
		
// Rectangle rect=new Rectangle(67, 49);
// Triangle tri=new Triangle(20,90);
	}
}
