package com.cybage.exception;

public class CustomException {

	public static void main(String[] args)  {
		int age=17;
		try {
		if(age<18)
			throw new AgeException("Invalid Age for Voting ");
		}
		
		catch (AgeException e){
			e.printStackTrace();
		}
	}
	
	

}
