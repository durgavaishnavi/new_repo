package com.bridgelabz.basiccoreprogram;
import java.util.*;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int number1, number2, temporary;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value for number1 :");
		number1 = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the value for number2 :");
		number2 = s2.nextInt();
		System.out.println("Value before swapping number1:" + number1);
		System.out.println("Value before swapping number2:" + number2);
		temporary = number1;
		number1 = number2;
		number2 = temporary;
		System.out.println("Value for number1 afer swapping :" + number1);
		System.out.println("Value for number2 after swapping :" + number2);
		

	}

}
