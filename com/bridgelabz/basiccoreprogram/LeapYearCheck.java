package com.bridgelabz.basiccoreprogram;
import java.util.*;

public class LeapYearCheck {

	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year :");
		year = input.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
        {
             System.out.println("Entered year is a leap year");
        }
        else {
        	System.out.println("Enterd year is not a leap year");
        }
	}

}
