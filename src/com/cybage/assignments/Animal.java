package com.cybage.assignments;

class Animal1 {
	
	 void respirate()
	{
	System.out.println("hi am respirate");
	}
	 void talk()
	{
	System.out.println("hi am talk");
	}
class cat extends Animal1
{
	
	 @Override
	 void talk()
	 {
		 System.out.println("hi overided cat talk");
	 }
	 void meow()
	 {
		 System.out.println("hi meow");
	 }
	 
}

class dog extends Animal1 {
	 @Override
	 void talk() {
   System.out.println("DOG IS overiding talk");
 }

 void bark() {
   System.out.println("--dog is-barking()");
 }
}

	
	

public static class Animal
{
	  public static void main (String[] args) 
	  {
	    
	  
	    Animal1 [][] animals;
	    dog [][] dogs = new dog[10][10];
     
        
	  
	}
}  
}