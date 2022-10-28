package com.cybage.basic;

class Demo {
	public static void main(String[] args) 
	{
	
		System.out.println("x demo constructor");
	
}}

class DemoY extends Demo
{
	public static void main(String[] args) 
	{
		System.out.println("Y demo constructor");

}}
 class DemoZ extends DemoY
{
	 public static void main(String[] args) 
	 {
	
		System.out.println("Z demo constructor");
	
	 }


{
	
DemoZ z=new DemoZ();
}

}

