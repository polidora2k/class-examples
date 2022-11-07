package com.teksystems.examples;

import java.util.Scanner;

public class Examples1 {

	public static void main(String[] args) {
		// Introduction
		System.out.println("Hello World\n");

		// Data Types
		double radius;
		double area;

		// Constants
		final double PI = 3.14159;

		// Assign a radius
		radius = 20;

		// Compute Area
		area = radius * radius * PI;

		// Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area + "\n");

		// Primitive data types
		byte num;
		num = 113;
		System.out.println(num);

		short snum;
		snum = 150;
		System.out.println(snum);
		
		int inum = 40000;
		System.out.println(inum);

		long lnum = -12332252626L;
		System.out.println(lnum);

		double dnum = -42937737.9d;
		System.out.println(dnum);

		float fnum = 19.98f;
		System.out.println(fnum);

		boolean b = false;
		System.out.println(b);

		char ch = 'Z';
		System.out.println(ch);

		// Scanner Introduction
		// Create the scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter your name: ");

		// Read input
		String name = input.nextLine();

		// Print the name.
		System.out.println("My name is " + name);

		// Close the scanner
		input.close();
		
	}
}