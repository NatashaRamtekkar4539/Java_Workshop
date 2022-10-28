package com.cybage.basic;

public class InheritanceDemo {

	public static void main(String[] args) {
	Inheritance inheritance=new Inheritance("Natasha","Nagpur");
	System.out.println("Name: "+inheritance.getName()+" "+"Address: "+inheritance.getAddress());
	
	//subclass:-
	
	Student_Inheritance student_inheritance=new Student_Inheritance("Richa","Kamptee",99,89);
	System.out.println("Name: "+student_inheritance.getName()+" "+"Address: "+student_inheritance.getAddress()+" "+"RollNo: "+""+student_inheritance.getrollNo()+" "+"Marks: "+student_inheritance.getmarks());
	}

}
