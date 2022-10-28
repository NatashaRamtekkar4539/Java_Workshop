package com.cybage.assignments;

import static java.lang.Math.PI;

import java.util.Scanner;




public class StaticPi 
{


    public static void main(String[] args) {
        double r=5, a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
       

        a = PI * r * r;
        
        System.out.println("Area of the circle is: " + a);
    }
}
