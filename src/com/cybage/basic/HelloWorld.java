package com.cybage.basic;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("Hello World");
		
		Date d=new Date();
		System.out.println("date= "+d);
				
		int n1=10;
//		double d=10.5;
		float pi =3.14f;
		short s=20;
		byte b=30;
		
		long l=343542;
		//type casting
		
		int n2=(int) l;
		
		System.out.println("n1: "+n1);
//		System.out.println("d: "+d);
		System.out.println("pi: "+pi);
		System.out.println("s: "+s);
		System.out.println("b: "+b);
//		System.out.println("l: "+l);
//		System.out.println("n2: "+n2);		
	}
}
