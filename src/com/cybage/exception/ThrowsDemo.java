package com.cybage.exception;

import java.io.IOException;
//
//public class ThrowsDemo {
//	public static void demo() throws IOException{
//		throw new IOException();
//	}
//	
//	public static void main(String[] args) throws IOException {
////		try {
//			demo();
////		}
//		
////		catch (Exception e){
////			e.printStackTrace();
////		}
//	}


	class ThrowsDemo {
		public void demo() throws IOException{
			throw new IOException();
//			System.out.println("demo exception");
		}
	}
	
	 class ThrowsDemo1 extends ThrowsDemo {
		 
			
		 @Override
			public  void demo() throws IOException {
//			 new IOException();
		 		super.demo();
//				System.out.println("demo exception in child");
		
	 }
		
		public static void main(String[] args) 
		{
			ThrowsDemo thdemo = new ThrowsDemo1();
			try {
				thdemo.demo();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
			}

	
	 }	
		

//
