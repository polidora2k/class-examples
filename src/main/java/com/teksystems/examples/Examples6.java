package com.teksystems.examples;

import java.util.*;
import java.math.BigInteger;

public class Examples6 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		BigInteger a = new BigInteger(in.next());
		in.nextLine();
		BigInteger b = new BigInteger(in.next());
		in.nextLine();

		System.out.println(a.add(b));
		System.out.println(a.multiply(b));

		in.close();
	}

}
