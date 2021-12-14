package com.bridgelabz.basiccoreprogram;
public class flipcoin {
 
	public static void main(String[] args) {
	 int flipcounts = 10;
	 int tails = 0;
	 int heads = 0;
	 for(int i=0; i <flipcounts; i++)
	 {
		 if(Math.random() < 0.5)
		 {
			 tails++;
		 }
		 
	 }
		 double PercentageOfTails = (tails*100)/flipcounts;
		 double PercentageofHeads = 100-PercentageOfTails;
		 System.out.println("Percentage of Heads : " + PercentageofHeads);
		 System.out.println("Perceentage of Tails : " + PercentageOfTails);

	}

}
