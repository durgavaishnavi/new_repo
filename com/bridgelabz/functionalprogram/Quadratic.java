package com.bridgelabz.functionalprogram;
import java.util.*;
public class Quadratic {

	public static void main(String[] args) {
		double a,b,c;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value for a :");
		a = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the value for b :");
		b = s2.nextInt();
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter the value for c :");
		c = s3.nextInt();
		double delta = (b*b)-(4*a*c);
		double val1 = 0-b;
		if (delta > 0)
		{
			double root1 = ((val1)+(Math.sqrt(delta))/(2*a));
			double root2 = ((val1)-(Math.sqrt(delta))/(2*a));
			System.out.format("The value of root 1 is %.2f", root1 );
			System.out.format("The value of root 2 is %.2f", root2 );
		}
		else if (delta == 0) {
			double root1 = (val1)/(2*a);
			double root2 = (val1)/(2*a);
		}
		else {
			double real = val1/(2*a);
			double imaginary = Math.sqrt(-delta)/(2*a);
			System.out.format("The value for Root1 = %.2f+%.2fi",real,imaginary);
			System.out.format("The value for Root2 = %.2f-%.2fi",real,imaginary);
		}
			
		
		}

}
