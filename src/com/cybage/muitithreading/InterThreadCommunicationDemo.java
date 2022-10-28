package com.cybage.muitithreading;

class Shared
{
	int num;
	boolean flag=false;
	synchronized int get() throws InterruptedException
	{
		if(flag==false)
		{ wait();
		}
			
		System.out.println(Thread.currentThread().getName()+""+num);
		flag=false;
		notify();
		return num;
	}
	
	synchronized void put(int num) throws InterruptedException
	{
		if(flag==true)
		{
				System.out.println("Waiting for consumer");
			}
					
		this.num=num;
		System.out.println(Thread.currentThread().getName()+""+num);
		flag=true;
		notify();
	}
}

class Producer extends Thread{
	Shared s;
	String name;
	public Producer(Shared s,String name) {
		super(name);
		this.s=s;
		this.start();
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				s.put(++i);
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	Shared s;
	String name;
	public Consumer(Shared s,String name) {
		super(name);
		this.s=s;
		this.start();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				s.get();
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		Shared s=new Shared();
		new Producer(s,"Producer1"
				+ "");
		new Consumer(s,"Consumer1");
	}
}
