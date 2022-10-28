package com.cybage.basic;

interface Vehicle{
	
	public String getColor();
	public int getmodalNumber();
	
}

class Bike implements Vehicle{
	String name;
	String color ;
	int number;
	
	void setData(String name,String color,int number)
	{
		this.name=name;
		this.color=color;
		this.number=number;
	
	}
	
	public String getName()
	{
		return name;
	}
	@Override
	public String getColor()
	{
		return color;
	}

	@Override
	public int getmodalNumber() {
		
		return number;
	}
}


class Car implements Vehicle{
	String name1;
	String color1 ;
	int number1;
	
	void setData(String name1,String color1,int number1)
	{
		this.name1=name1;
		this.color1=color1;
		this.number1=number1;
	
	}
	
	public String getName()
	{
		return name1;
	}
	@Override
	public String getColor()
	{
		return color1;
	}

	@Override
	public int getmodalNumber() {
		
		return number1;
	}
}


public class AssignmentInterface {

	public static void main(String[] args) {
		
		
		
		
		
		Bike bike=new Bike();
		bike.setData("Splender","Black",2756);
		String name=bike.getName();
		String color=bike.getColor();
		int number=bike.getmodalNumber();
		
		System.out.println("----------------------Bike Information--------------------------");
		System.out.println("Bike Name: "+name+" "+"Color: "+color+" "+"Modal Number: "+number);
		
		Car car=new Car();
		car.setData("TATA","White",5678);
		String name1=car.getName();
		String color1=car.getColor();
		int number1=car.getmodalNumber();
		
		System.out.println("\n");
		
		System.out.println("------------------------Car Information---------------------------");
		System.out.println("Car Name: "+name1+" "+"Color: "+color1+" "+"Modal Number: "+number1);
		

	}

}


