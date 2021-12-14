package com.bridgelabz.basiccoreprogram;
import java.util.*;
public class OddOrEven {

	public static void main(String[] args) {
		int Number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number greate than 0 :");
		Number = input.nextInt();
		if (Number % 2 == 0)
		{
			System.out.println("Enter Number is a even number");
		}
		else
			System.out.println("Enetred Number is a Odd number");
		

	}

}
