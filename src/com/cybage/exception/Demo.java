package com.cybage.exception; //Unchecked Exception example

public class Demo {

	public static void main(String[] args) {
		try {
		int a=10;
		int l=args.length;
		int b=l;
		int c=a/l;
		int arr[]=new int[5];
		System.out.println(arr[5]);
//		System.out.println("c="+c);
	}
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
//		catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		
//		catch(Exception e) {   //this must be your last catch block
//			e.printStackTrace();
//		}
//		
		finally {
			System.out.println("After finally block...");
		}
		System.out.println("After catch block...");
	}
}
