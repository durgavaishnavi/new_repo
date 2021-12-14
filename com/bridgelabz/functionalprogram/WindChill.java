package com.bridgelabz.functionalprogram;

public class WindChill {

	public static void main(String[] args) {
		//Entering t value smaller than 50 and v should be between 3 and 120
		int t = Integer.parseInt(args[0]);
		int v = Integer.parseInt(args[1]);
		double product1 = (0.6215 * t);
		double product2 = (0.4275 * t);
		double power = Math.pow(v,0.16);
		double windchill = 35.74 + product1+product2 - 35.75*power;
		System.out.println("The value of windchill is " + windchill);
		

	}

}
