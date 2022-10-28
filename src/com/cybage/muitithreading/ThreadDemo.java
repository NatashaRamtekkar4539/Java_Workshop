package com.cybage.muitithreading;

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
		
	@Override
	public void run() {
//		System.out.println("Run Method");
		
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		try {
			Thread.sleep(3000);  //Thread Sleep Method
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		MyThread thread1=new MyThread("Thread1");
		MyThread thread2=new MyThread("Thread2");
		MyThread thread3=new MyThread("Thread3");
		MyThread thread4=new MyThread("Thread4");
		MyThread thread5=new MyThread("Thread5");
		MyThread thread6=new MyThread("Thread6");
		thread1.start();
		System.out.println("Status of thread1"+" "+thread1.isAlive());  //method is runnable or block 
		thread1.join();  //thread join method
		System.out.println("Status of thread1"+" "+thread1.isAlive());
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
	}
}


