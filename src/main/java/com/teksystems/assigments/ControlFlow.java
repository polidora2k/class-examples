package com.teksystems.assigments;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		/*
		 * 1.Write a program that declares 1 integer variable x, and then assigns 7 to
		 * it. Write an if statement to print out “Less than 10” if x is less than 10.
		 * Change x to equal 15, and notice the result (console should not display
		 * anything).
		 */
		int x = 15;

		if (x < 10) {
			System.out.println("Less than 10");
		}

		/*
		 * 2. Write a program that declares 1 integer variable x, and then assigns 7 to
		 * it. Write an if-else statement that prints out “Less than 10” if x is less
		 * than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and
		 * notice the result.
		 */
		int x2 = 15;

		if (x2 < 10) {
			System.out.println("Less than 10");
		} else if (x2 > 10) {
			System.out.println("Greater than 10");
		}

		/*
		 * 3. Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else-if statement that prints out “Less than 10” if x is less
		 * than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
		 * “Greater than or equal to 20” if x is greater than or equal to 20. Change x
		 * to 50 and notice the result.
		 */
		int x3 = 50;

		if (x3 < 10) {
			System.out.println("Less than 10");
		} else if (x3 > 10 && x3 < 20) {
			System.out.println("Between 10 and 20");
		} else if (x3 > 20) {
			System.out.println("Greater than 20");
		}

		/*
		 * 4. Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else statement that prints “Out of range” if the number is
		 * less than 10 or greater than 20 and prints “In range” if the number is
		 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
		 * result.
		 */
		int x4 = 5;

		if (x4 < 10 || x4 > 20) {
			System.out.println("Out of Range");
		} else if (x4 >= 10 && x4 <= 20) {
			System.out.println("In Range");
		}

		/*
		 * 5. Write a program that uses if-else-if statements to print out grades A, B,
		 * C, D, F according to the following criteria:
		 *
		 * A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: <60 Use the Scanner class to accept a
		 * number score from the user to determine the letter grade. Print out “Score
		 * out of range” if the score is less than 0 or greater than 100.
		 */
		Scanner input = new Scanner(System.in);
		
//		System.out.print("Enter your score: ");
//		int score = input.nextInt();
//		
//		if (score<0 || score>100) {
//			System.out.println("Score out of range.");
//		} else if (score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80)	{
//			System.out.println("B");
//		} else if (score >=70) {
//			System.out.println("C");
//		} else if (score >=60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}

		/*
		 * 6. Write a program that accepts an integer between 1 and 7 from the user. Use
		 * a switch statement to print out the corresponding weekday. Print “Out of
		 * range” if the number is less than 1 or greater than 7. Do not forget to
		 * include “break” statements in each of your cases.
		 */
//		System.out.print("Enter a number between 1 and 7: ");
//		
//		int num = input.nextInt();
//		
//		
//			switch (num) {
//			case 1:
//				System.out.println("Sunday");
//				break;
//			case 2:
//				System.out.println("Monday");
//				break;
//			case 3:
//				System.out.println("Tuesday");
//				break;
//			case 4:
//				System.out.println("Wednesday");
//				break;
//			case 5:
//				System.out.println("Thursday");
//				break;
//			case 6:
//				System.out.println("Friday");
//				break;
//			case 7:
//				System.out.println("Saturday");
//				break;
//			default:
//				System.out.println("Out of Range");
//			}

		
		/*
		 * 7. Write a Java program for the below requirements.
		 *
		 * The U.S. federal personal income tax is calculated based on the filing status
		 * and taxable income. There are four filing statuses: Single, Married Filing
		 * Jointly, Married Filing Separately, and Head of Household. The tax rates for
		 * 2009 are shown below.
		 */
		String[] statusNames = {"Single", "Married Filing Jointly", "Married Filing Separately", "Head of Household"};
			
		System.out.println("Welcome to the Income Tax Calculator!\nFiling options are listed below enter the number that corresponds to your filing status.");
		System.out.println("1 - Single\n2 - Married Filing Jointly\n3 - Married Filing Separately\n4 - Head of Household");
		System.out.print("Filing Status: ");
		int status = input.nextInt();
		
		while (status < 1 && status > 4) {
			System.out.println("Invalid Status. Please Try Again.");
			System.out.print("Filing Status: ");
			status = input.nextInt();
		}
		
		System.out.print("Please enter your taxable income: $");
		double income = input.nextDouble();
		
		while (income < 0) {
			System.out.println("Cannot have a negative income. Please Try Again.");
			System.out.print("Please enter your taxable income: $");
			income = input.nextDouble();
		}
		
		double taxRate = 0;
		
		
		switch (status) {
		case 1:
			if (income >= 372951) {
				taxRate = 0.35;
			} else if (income >= 171551) {
				taxRate = 0.33;
			} else if (income >= 82251)	{
				taxRate = 0.28;
			} else if (income >= 33951) {
				taxRate = 0.25;
			} else if (income >= 8351) {
				taxRate = 0.15;
			} else {
				taxRate = 0.10;
			}
			break;
		case 2:
			if (income >= 372951) {
				taxRate = 0.35;
			} else if (income >= 208851) {
				taxRate = 0.33;
			} else if (income >= 137051)	{
				taxRate = 0.28;
			} else if (income >= 67901) {
				taxRate = 0.25;
			} else if (income >= 16701) {
				taxRate = 0.15;
			} else {
				taxRate = 0.10;
			}
			break;
		case 3:
			if (income >= 186476) {
				taxRate = 0.35;
			} else if (income >= 104426) {
				taxRate = 0.33;
			} else if (income >= 68526)	{
				taxRate = 0.28;
			} else if (income >= 33951) {
				taxRate = 0.25;
			} else if (income >= 8351) {
				taxRate = 0.15;
			} else {
				taxRate = 0.10;
			}
			break;
		case 4:
			if (income >= 372951) {
				taxRate = 0.35;
			} else if (income >= 190201) {
				taxRate = 0.33;
			} else if (income >= 117451)	{
				taxRate = 0.28;
			} else if (income >= 45501) {
				taxRate = 0.25;
			} else if (income >= 11951) {
				taxRate = 0.15;
			} else {
				taxRate = 0.10;
			}
			break;	
		}
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.printf("While filing as %s with an income of %s, your income tax is %s.\n", statusNames[status-1], nf.format(income), nf.format(taxRate * income));
		
		input.close();
	}

}
