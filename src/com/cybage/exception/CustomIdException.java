package com.cybage.exception;

public class CustomIdException {

	public static void main(String[] args)  {
		int id=0; 
		try{
		if(id==0)
			throw new InvalidIdException("Invalid ID");
		}
		
		catch (InvalidIdException e)
		{
			e.printStackTrace();
		}
	}
	
	

}
