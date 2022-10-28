package com.cybage.assignments;

public class EmployeeArray {
	static int count = 0;
    int [] array= new int [8];
    private int empNum;
    private double empSal;
	  
    public EmployeeArray(){
        count+=1;
    }
	   

    void emp(int e, double s){
        empNum = e;
        empSal = s;
    }

    public int getEmpNum(){
        return empNum;
    }
    public double getSalary(){
        return empSal;
    }
    
    public static void main(String[]args)
    {
        
        
        EmployeeArray e1 = new EmployeeArray();
        EmployeeArray e2 = new EmployeeArray();
        EmployeeArray e3 = new EmployeeArray();
      
    
        System.out.println("Number of employee objects are : " + EmployeeArray.count);
    }
    }

