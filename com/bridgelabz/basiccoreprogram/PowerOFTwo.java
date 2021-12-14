package com.bridgelabz.basiccoreprogram;

public class PowerOFTwo {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int Power;
		for(int i =0; i<=N; i++)
		{
			Power = (int)Math.pow(2,i);
			System.out.println( i + "  " + Power);
			
		}
		
		}
}
