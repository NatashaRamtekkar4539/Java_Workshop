package com.cybage.basic;

class Employee
{
	int employeeId;
	String name;
	static String  msg;     //static variable
	public Employee()
	{
		
	}
	public  Employee (int employeeId,String name)
	{

//		this.employeeId=employeeId;
		
		this(employeeId);
		this.name=name;
		}

	public Employee(int employeeId)
	{
		this.employeeId=employeeId;
	}
	
	String getEmployeeInfo()
	{
		return "employeeId="+employeeId+" "+"name="+name;
	}
	
	static void displayMessage()
	{
		System.out.println(msg);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		
		//Printing using Array :-
		
		Employee employee[]=new Employee[5];
		employee[0]=new Employee(1001,"Natasha");
		employee[1]=new Employee(1002,"Richa");
		employee[2]=new Employee(1003,"Riddhi");
		employee[3]=new Employee(1004,"Siddhi");
		employee[4]=new Employee(1005,"Manu");
		
		for(Employee e:employee)
		{
			System.out.println(e.getEmployeeInfo());
		}
			
//		Employee employee1=new Employee(1001,"Natasha");
//		Employee employee2=new Employee(1002,"Richa");
//		Employee.msg="Hello from Java";
//		Employee.displayMessage();
			
//		employee.employeeId=1001;
//		employee.name="Natasha";
//		employee.employeeId=1002;
//		employee.name="Richa";
		
//		System.out.println(employee1.getEmployeeInfo());		
//		System.out.println(employee2.getEmployeeInfo());
//		System.out.println(employee1.msg);
//		employee1.msg="Modified msg";
//		System.out.println(employee2.msg);
//		System.out.println(employee1.msg);
//		employee2.msg="Again Modified msg";
//		System.out.println(employee1.msg);
	}
}
