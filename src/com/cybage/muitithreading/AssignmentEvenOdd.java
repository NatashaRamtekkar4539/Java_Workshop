package com.cybage.muitithreading;


class AssignmentEvenOdd {
	public static void main(String[] args) throws InterruptedException {
	Runnable runnable=()->
	{
		for(int i=0;i<=20;i++)
		{
			if(i/2 ==0)
			{System.out.println("Even No: "+" "+i);//.getName()
			}else {System.out.println("Odd No: "+" "+i);//.getName()
			
			}
		}
	};

			System.out.println(Thread.currentThread().getName());
		Thread thread1=new Thread(runnable);
			Thread thread2=new Thread(runnable);
			
			thread1.start();
//			System.out.println("Status of thread1");  //method is runnable or block 
			thread1.join();  //thread join method
//			System.out.println("Status of thread1");
			thread2.start();
			
	
	}
}




	

