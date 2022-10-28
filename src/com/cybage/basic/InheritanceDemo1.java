package com.cybage.basic;

//default class:-

final sssclass Inheritance1
{
	private String name;
	private String address;
	Inheritance1(String name, String address)
	{
		this.name=name;
		this.address=address;
	}

//	public String getName()
//	{
//		return this.name;
//	}
//	
//	public String getAddress()
//	{
//		return this.address;
//	}
	
	public String getInfo() {
		return "name="+this.name+" address="+this.address;
	}

}

class Student_Inheritance1 extends Inheritance1
{
	private int rollNo;
	private int marks;
		Student_Inheritance1(String name, String address,int rollNo,int marks)
		{
			super(name,address);
			this.rollNo=rollNo;
			this.marks=marks;
		}
		
//		public int getrollNo()
//		{
//			return this.rollNo;
//		}
//		
//		public int getmarks()
//		{
//			return this.marks;
//		}
		
		@Override
		public String getInfo()
		{
			return super.getInfo()+"rollNo="+this.rollNo+" "+"marks="+this.marks;
		}
}

public class InheritanceDemo1 {

		public static void main(String[] args) {
		Inheritance1 inheritance=new Inheritance1("Natasha","Nagpur");
//		System.out.println("Name: "+inheritance.getName()+" "+"Address: "+inheritance.getAddress());
		
		System.out.println(inheritance.getInfo());
		
		//subclass:-
		
		Student_Inheritance1 student_inheritance=new Student_Inheritance1("Richa","Kamptee",99,89);
	//System.out.println("Name: "+student_inheritance.getName()+" "+"Address: "+student_inheritance.getAddress()+" "+"RollNo: "+ " "+student_inheritance.getrollNo()+" "+"Marks: "+student_inheritance.getmarks());
		
		System.out.println(student_inheritance.getInfo());
	
		Inheritance1 i=new Student_Inheritance1("Riddhi","Pune",78,95);
		System.out.println(i.getInfo());
		}

	}
