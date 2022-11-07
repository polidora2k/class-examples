package com.teksystems.assigments;

import java.text.NumberFormat;
import java.util.Locale;

public class Loops {

	public static void main(String[] args) {
		multiplicationTable();
	}
	
	public static void predictFutureTuition() {
		double initialTuition = 10000;
		final double INCREASE_RATE = 1.07;
		double currentTuition = initialTuition;
		int numberOfYears = 0;
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println("\t----------------------");
		System.out.printf("\t|%4s|%15s|\n", "Year", "Tuition");
		System.out.println("\t----------------------");
		
		
		while (currentTuition < 2 * initialTuition) {
			numberOfYears++;
			currentTuition *= INCREASE_RATE;
			
			System.out.printf("\t|%-4d|%15s|\n", numberOfYears, nf.format(currentTuition));
		}
		System.out.println("\t----------------------");
		System.out.println("The tuition will be doubled in " + numberOfYears + " years.");
	}
	
	public static void multiplicationTable() {
		
		for (int row = 1; row <= 12; row++) {
			System.out.print(row + "\t");
			for (int col = 1; col<= 12; col++) {
				System.out.printf("%3d\t", row * col);
			}
			System.out.println();
		}
	}

}
