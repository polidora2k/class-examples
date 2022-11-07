package com.teksystems.examples;

import java.util.Scanner;

public class Examples2 {
	public static void main(String args[]) {
		calculateBMI();
	}
	
	public static void StringManipulation() {
		String word = new String("Word");
		System.out.println("Mem1" + Integer.toHexString(word.hashCode()));
		
		word = word.toLowerCase();
		
		System.out.println("Mem2" + Integer.toHexString(word.hashCode()));
		System.out.println(word);
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
	}
	
	public static void calculateBMI() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your weight in kilograms: ");
		double weight = sc.nextDouble();
		System.out.println("Enter your height in meters: ");
		double height = sc.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);
		
		System.out.printf("Your BMI with weight %.2f kg and height %.2f m is %.2f.%n", weight, height, bmi);
		
		sc.close();
	}
}
