package com.bridgelabz.basiccoreprogram;
import java.util.*;
public class LargestAmongThree {

	public static void main(String[] args) {
		double num1;
        System.out.println("Enter value for num1: ");
        Scanner s1 = new Scanner(System.in);
        num1=s1.nextDouble();
        double num2;
        System.out.println("Enter value for num2: " );
        Scanner s2 = new Scanner(System.in);
        num2=s2.nextDouble();
        double num3;
        System.out.println("Enter value for num3: " );
        Scanner s3 = new Scanner(System.in);
        num3=s3.nextFloat();
        if ( (num1 >= num2) && (num1 >= num3)) 
        	System.out.println(num1 + " is greater :");
        	else if((num2 >= num1) && (num2 >= num3)) 
        		System.out.println(num2 +" is greater");
        		else
        			System.out.println(num2 + "is greater");
        	
        

	}

}
