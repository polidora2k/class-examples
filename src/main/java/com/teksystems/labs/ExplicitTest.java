package com.teksystems.labs;

public class ExplicitTest {

	public static void main(String[] args) {
		double d = 100.04;
		long l = (long) d;
		int i = (int) l;

		System.out.println("Double value " + d);
		System.out.println("Long value " + l);
		System.out.println("Int value " + i + "\n");

		byte b;
		int z = 257;
		double dou = 323.142;

		System.out.println("Conversion of int to byte.");

		b = (byte) z;

		System.out.println("i = " + z + " b = " + b + "\n");
		System.out.println("Conversion of double to int.");

		z = (int) dou;

		System.out.println("d = " + dou + " b = " + z + "\n");
		System.out.println("Conversion of double to byte.");

		b = (byte) dou;

		System.out.println("d = " + dou + " b = " + b + "\n");
	}

}
