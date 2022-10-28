package com.cybage.muitithreading;

class First{
	public void display(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.print("]");
	}
}

class Second extends Thread{
	String msg;
	First first;
	Second(First first,String msg){
	this.first=first;
	this.msg=msg;
	start();
	}

public void run()
{
	first.display(msg);
}
}

public class SyncDemo {

	public static void main(String[] args) {
		First fnew = new First();
		Second s1=new Second(fnew,"Welcome");
		Second s2=new Second(fnew,"new");
		Second s3=new Second(fnew,"programmer");

	}

}
