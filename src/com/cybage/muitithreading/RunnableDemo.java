package com.cybage.muitithreading;

//till java 7 using the runnable 

//class Thread1 implements Runnable{
	
//@Override
//public void run()
//{
//	System.out.println("Currently Running Thread ");
//}
//}
public class RunnableDemo {

	public static void main(String[] args) {
	Runnable runnable=()->
	{
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
	
//		Runnable runnable=()->System.out.println("run method using lambda"+" "+Thread.currentThread().getPriority());//.getName()
//		Thread thread=new Thread(runnable,"MyThread");
//		thread.start();
	};
		Thread thread=new Thread(runnable,"MyThread");
		thread.start();
}
	
}