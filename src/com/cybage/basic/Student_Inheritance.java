package com.cybage.basic;

public class Student_Inheritance extends Inheritance
{
	private int rollNo;
	private int marks;
		Student_Inheritance(String name, String address,int rollNo,int marks)
		{
			super(name, address);
			this.rollNo=rollNo;
			this.marks=marks;
		}
		
		public int getrollNo()
		{
			return this.rollNo;
		}
		
		public int getmarks()
		{
			return this.marks;
		}
}

