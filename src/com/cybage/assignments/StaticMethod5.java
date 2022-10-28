package com.cybage.assignments;

import java.io.*;


public class StaticMethod5 {


	
	static int a = 40;
	int b = 50;

	void show()
	{
		System.out.println(a);
		System.out.println(b);
	}

	static void staticshow()
	{
	System.out.println(a);
	}

	
	public static void main(String[] args)
	{
		StaticMethod5 s = new StaticMethod5();
		s.show();
		staticshow();
	}
}
