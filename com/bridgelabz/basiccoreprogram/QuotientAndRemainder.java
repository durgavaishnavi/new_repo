package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		int Quotient , Remainder, Dividend, Divisor;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for Dividend :");
		Dividend = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number for Divisor :");
		Divisor = s1.nextInt();
		Quotient = Dividend/Divisor;
		Remainder = Dividend%Divisor;
		System.out.println("The Quotient is : " + Quotient);
		System.out.println("The Remainder is :" + Remainder);

	}

}
