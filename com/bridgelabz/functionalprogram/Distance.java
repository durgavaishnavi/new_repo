package com.bridgelabz.functionalprogram;

public class Distance {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("Argument x :" + x);
		System.out.println("Argument y :" + y);
		double square1 = Math.pow(x,2);
		double square2 = Math.pow(y,2);
		double sum = (square1+square2);
		double distance = Math.sqrt(sum);
		System.out.println("The Euclidean distance from given point to otigin is :" + distance);

	}

}
