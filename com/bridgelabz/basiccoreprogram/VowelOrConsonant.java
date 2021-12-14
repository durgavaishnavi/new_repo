package com.bridgelabz.basiccoreprogram;
import java.util.*;
public class VowelOrConsonant {

	public static void main(String[] args) {
	     char ch;
	     Scanner input = new Scanner(System.in);
	     System.out.println("Enter any one Alphabet :");
	     ch = input.next().charAt(0);
	     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	    	 System.out.println("The entered Alphabet is a vowel");
	     else
	    	 System.out.println("The entered Alphabet is a consonant");

	}

}
