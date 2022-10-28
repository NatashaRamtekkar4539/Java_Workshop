package com.cybage.muitithreading;

class First1{
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

class Second1 extends Thread{
	String msg;
	First1 fobj;
	Second1(First1 fp,String str){
	fobj=fp;
	msg=str;
	start();
	}

public void run()
{
	synchronized(fobj) { //Synchronization block
		fobj.display(msg);	
	}
	
}
}

public class SyncBlock {

	public static void main(String[] args) {
		First fnew = new First();
		Second s1=new Second(fnew,"Welcome");
		Second ss1=new Second(fnew,"new");
		Second ss2=new Second(fnew,"programmer");

	}

}
