package com.bridgelabz.basiccoreprogram;
import java.util.*;
public class HarmonicNumber {

	public static void main(String[] args) {
		double Harmonic = 1;
		double i;
		double N;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Value greater than 0 for N harmonic number");
		N = input.nextDouble();
		for (i =2; i<=N; i++)
		{
			Harmonic = (Harmonic+(1/i));
		}
			System.out.println("The Nth Harmonic number is : " + Harmonic);
		
		
		

	}

}
