package com.bridgelabz.basiccoreprogram;
import java.util.*;
public class PrimeFactors {

	public static void main(String[] args) {
		int N;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for N to calculate prime factor :");
		N = input.nextInt();
		while(N%2 == 0)
		{
			System.out.println(2 + "");
			N = N/2;
		}
		for(int i =3; i<=Math.sqrt(N); i+=2)
		{
			while(N%i == 0)
			{
				System.out.println(i + " ");
				N = N/i;
			}
		}
		if(N>2)
			System.out.println(N);

	}

}
