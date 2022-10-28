package com.cybage.basic;


 // Lambda Expression makes your code more readable and concise


@FunctionalInterface  //optional-- won't let you write any other abstract method
interface Greeting
{
//	public void greet();
	
//	public void greet(String msg);
	
	public String greet(String msg); //when returning a value
	
}




public class LamdaDemo {

	public static void main(String[] args)
	{
		
		// -> : Lambda Operator and its Expression
//		Greeting greeting=()->{System.out.println("Hello From Lambda Expression");};  //{} i.e curly braces are optional
//		greeting.greet();  //using reference variable it is calling abstract function greet()

		
		//passing the parameters in the function i.e msg and datatype
		
//		Greeting greeting=(String msg)->System.out.println(msg);
		
//		Greeting greeting=(msg)->System.out.println(msg);//can skip the datatype 
		
//		Greeting greeting=msg->System.out.println(msg);//can skip the round braces if only single parameter
//		greeting.greet("Hello from Java");  //using reference variable it is calling abstract function greet()
		
		
//		Greeting greeting=msg->{return msg;}; //when returning curly braces are compulsory otherwise error
//		System.out.println(greeting.greet("Hello From Java :)"));
		
		Greeting greeting=msg-> msg; //if only one parameters can remove curly braces and return keyword
		System.out.println(greeting.greet("Hello From Java :|"));
		
		
		
		
	
		
	}

}
