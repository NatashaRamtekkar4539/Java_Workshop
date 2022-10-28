package com.cybage.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee>{
	String name;
	Integer id;
	Integer age;
	String address;
	

	@Override
	public String toString() {
		return "Employee \n Name=" + name + ",\n Id=" + id + ",\n Age=" + age
				+ ", \n address=" + address ;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(String name, Integer id, Integer age, String address) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
	}

	
	
	
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return (this.getAge()-o.getAge());
//	}
//

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return (e1.getAge()-e2.getAge());
	}
	
	
//	@Override
//	public int compareTo(Employee ob) {
//		// TODO Auto-generated method stub
//		return (this.getName().compareTo(ob.getName()));
//	}
}

public class EmployeeArrayList {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		Employee employee=new Employee("Natasha", 27595, 22, "Nagpur");
		emp.add(new Employee("Richa", 27599, 22, "Nagpur"));
		emp.add(new Employee("Riddhi", 27600, 22, "Nagpur"));
		emp.add(new Employee("Siddhi", 27612, 22, "Nagpur"));
		emp.add(new Employee("Mannu", 27599, 21, "Nagpur"));

		emp.add(employee);
//		System.out.println(emp);
		Collections.sort(emp,(e1,e2)->(e1.getAge()-e2.getAge()));
//		System.out.print(emp);
		System.out.println(emp);
		
		Collections.sort(emp,(e1,e2)->(e1.getName().compareTo(e2.getName())));

	}

}
