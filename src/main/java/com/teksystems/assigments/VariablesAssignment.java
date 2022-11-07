package com.teksystems.assigments;

public class VariablesAssignment {

	public static void main(String[] args) {
		/*
		 * Task 1
		 * 
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result.
		 * 
		 */
		int int1 = 4;
		int int2 = 8;

		int result1 = int1 + int2;

		System.out.println("Task 1 Result = " + result1);

		/*
		 * Task 2
		 * 
		 * Write a program that declares 2 double variables, assigns a number to each,
		 * and adds them together. Assign the sum to a variable. Print out the result.
		 * 
		 */
		double dou1 = 3.8;
		double dou2 = 5.7;

		double result2 = dou1 + dou2;

		System.out.println("Task 2 Result = " + result2);

		/*
		 * Task 3
		 * 
		 * Write a program that declares an integer variable and a double variable,
		 * assigns numbers to each, and adds them together. Assign the sum to a
		 * variable. Print out the result. What variable type must the sum be? - Double.
		 * 
		 */
		int int3 = 6;
		double dou3 = 7.9;

		double result3 = int3 + dou3;

		System.out.println("Task 3 Result = " + result3);

		/*
		 * Task 4
		 * 
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and divides the larger number by the smaller number. Assign the result
		 * to a variable. Print out the result. Now change the larger number to a
		 * decimal. What happens? - Floating point division occurs. What corrections are
		 * needed? - The result variable needs to be a double.
		 * 
		 */
		int int4 = 5;
		int int5 = 64;

		int result4_1 = int5 / int4;

		System.out.println("Task 4.1 Result = " + result4_1);

		double dou4 = (double) int5;

		double result4_2 = dou4 / int4;

		System.out.println("Task 4.2 Result = " + result4_2);

		/*
		 * Task 5
		 * 
		 * Write a program that declares 2 double variables, assigns a number to each,
		 * and divides the larger by the smaller. Assign the result to a variable. Print
		 * out the result. Now, cast the result to an integer. Print out the result
		 * again.
		 * 
		 */
		double dou5 = 5.3;
		double dou6 = 98.4;

		double result5_1 = dou6 / dou5;

		System.out.println("Task 5.1 Result = " + result5_1);

		int result5_2 = (int) result5_1;

		System.out.println("Task 5.2 Result = " + result5_2);

		/*
		 * Task 6
		 * 
		 * Write a program that declares two integer variables, x, and y, and assigns 5
		 * to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now,
		 * cast y to a double and assign it to q. Print q again.
		 * 
		 */
		int x = 5;
		int y = 6;

		int q = y / x;

		System.out.println("Task 6.1 Results = " + q);

		/*
		 * Task 7
		 * 
		 * Write a program that declares a named constant and uses it in a calculation.
		 * Print the result.
		 * 
		 */
		final double PI = 3.1415926;
		int radius = 10;

		double circumference = 2 * PI * radius;

		System.out.println("Task 7 Results = " + circumference);

		/*
		 * Task 8
		 * 
		 * Write a program where you create 3 variables that represent products at a
		 * cafe. The products could be beverages like coffee, cappuccino, espresso,
		 * green tea, etc. Assign prices to each product. Create 2 more variables called
		 * subtotal and totalSale and complete an “order” for 3 items of the first
		 * product, 4 items of the second product, and 2 items of the third product. Add
		 * them all together to calculate the subtotal. Create a constant called
		 * SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
		 * Be sure to format the results to 2 decimal places.
		 * 
		 */
		final double SALES_TAX = 0.06;

		double coffee = 1.50;
		double cappuccino = 2.75;
		double espresso = 1.00;

		double subtotal, totalSale;

		subtotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);
		totalSale = subtotal * (1 + SALES_TAX);

		System.out.printf("Subtotal: $%.2f%nTotal: $%.2f", subtotal, totalSale);

	}

}
