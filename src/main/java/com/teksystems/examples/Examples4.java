package com.teksystems.examples;

import java.util.Arrays;

public class Examples4 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		// reading the number of elements for the size of the array
//		System.out.print("Enter the number of elements you want to store: ");
//		int n = sc.nextInt();
//
//		// creates an array in the memory of length 10
//		int[] array = new int[n];
//
//		// reading array elements from the user
//		for (int i = 0; i < n; i++) {
//			System.out.print("Enter element " + (i + 1) + " of the array: ");
//			array--[i] = sc.nextInt();
//		}
//
//		StringJoiner sj = new StringJoiner(", ");
//		// print out the results
//		System.out.println("Array elements are: ");
//		for (int i : array) {
//			sj.add(Integer.toString(i));
//		}
//		 
//		System.out.println(sj.toString()); 

		pyramids();

	}

	public static void sortingArrays() {
		int[] array = { 10, 2, 99, 4, 3, 2, 1, 5, 7, 8 };

		System.out.println("Original: " + Arrays.toString(array));

		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else {
					break;
				}
			}
		}

		System.out.println("Sorted: " + Arrays.toString(array));
	}

	public static void pyramids() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}

			for (int x = 2; x <= i; x++) {
				System.out.print(x);
			}

			for (int y = 0; y <= 5 - i; y++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print(i);
			}

			for (int y = 0; y <= 5 - i; y++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}

			for (int y = 0; y <= 5 - i; y++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 4; i++) {

			for (int k = 1; k <= 10; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
