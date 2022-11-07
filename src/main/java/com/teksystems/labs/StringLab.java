package com.teksystems.labs;

import java.util.Arrays;

public class StringLab {

	public static void main(String[] args) {
		// Length Demo
		System.out.println("Length Demo");

		String str1 = "Java";
		String str2 = "";

		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("Java".length());
		System.out.println("Java\n".length());
		System.out.println("Learn Java".length() + "\n");

		// isEmpty Demo
		System.out.println("isEmpty Demo");

		String s1 = "";
		String s2 = "hello";

		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty() + "\n");

		// Trim Demo
		System.out.println("Trim Demo");

		String trim1 = "  hello   ";

		System.out.println(trim1 + "how are you");
		System.out.println(trim1.trim() + "how are you" + "\n");

		// toLowerCase Demo
		System.out.println("toLowerCase Demo");

		String sl1 = "HELLO HOW Are You?";
		String slower = sl1.toLowerCase();

		System.out.println(slower + "\n");

		// toUpperCase Demo
		System.out.println("toUpperCase Demo");

		String su1 = "hello how are You?";
		String sUpper = su1.toUpperCase();

		System.out.println(sUpper);

		// Concat demo
		System.out.println("\nConcat Demo");

		String c1 = "Learn ";
		String c2 = "Java";

		System.out.println(c1.concat(c2));
		System.out.println(c2.concat(c1));

		String c3 = "hello";
		String c4 = "Learners";
		String c5 = c3 + c4;

		String message = "Welcome " + "to " + "Java";

		String s = "Chaper" + 2;
		String sc1 = "Supplement" + 'B';

		System.out.println(c5);
		System.out.println(message);
		System.out.println(s);
		System.out.println(sc1);

		// Split Demo
		System.out.println("\nSplit Demo");

		String vowels = "a::b::c::d:e";

		String[] result = vowels.split("::");

		System.out.println("result = " + Arrays.deepToString(result));

		// charAt demo
		System.out.println("\ncharAt Demo");

		String message2 = "Welcome to Java";
		System.out.println("The first character in the message is " + message2.charAt(0));

		// compareTo Demo
		System.out.println("\ncompareTo Demo");

		String cp1 = "hello";
		String cp2 = "hello";
		String cp3 = "hemlo";
		String cp4 = "flag";

		System.out.println(cp1.compareTo(cp2));
		System.out.println(cp3.compareTo(cp4));
		System.out.println(cp1.compareTo(cp4));

		// Substring Demo
		System.out.println("\nSubstring Demo");

		String ss1 = "java is fun";

		System.out.println(ss1.substring(0, 4));

		// indexOf Demo
		System.out.println("\nindexOf Demo");

		String si1 = "Java is fun";
		int result1;

		result1 = si1.indexOf('s');

		System.out.println(result1);

		result1 = si1.lastIndexOf('J');
		System.out.println(result1);

		result1 = si1.lastIndexOf('a');
		System.out.println(result1);

		result1 = si1.lastIndexOf('j');
		System.out.println(result1);

		result1 = si1.lastIndexOf("ava");
		System.out.println(result1);

		result1 = si1.lastIndexOf("java");
		System.out.println(result1);

		// Contains Demo
		System.out.println("\nContains Demo");

		String con1 = "Learn Java";
		Boolean cResult;

		cResult = con1.contains("Java");
		System.out.println(cResult);

		cResult = con1.contains("Python");
		System.out.println(cResult);

		cResult = con1.contains("");

		System.out.println(cResult);

		// Replace Demo
		System.out.println("\nReplace Demo");

		String sr1 = "abc cba";

		System.out.println(sr1.replace('a', 'z'));
		System.out.println("Lava".replace('L', 'J'));
		System.out.println("Hello".replace('4', 'J'));
		System.out.println(sr1.replace("C++", "Java"));
		System.out.println("aa bb aa zz".replace("aa", "zz"));
		System.out.println("Java".replace("C++", "C"));

		// Comparison Demos
		// equals() demo
		System.out.println("\nequals() Demo");

		String eq1 = "PerScholas";
		String eq2 = "PerScholas";
		String eq3 = new String("PerScholas");
		String eq4 = "Teksystem";
		System.out.println(eq1.equals(eq2));
		System.out.println(eq1.equals(eq3));
		System.out.println(eq1.equals(eq4));

		// == Demo
		System.out.println("\n== Demo");

		String sign1 = "Perscholas";
		String sign2 = "Perscholas";
		String sign3 = new String("Perscholas");
		System.out.println(sign1 == sign2);
		System.out.println(sign1 == sign3);

		// compareTo() Demo
		System.out.println("\ncompareTo() Demo");

		String ct1 = "Perscholas";
		String ct2 = "Perscholas";
		String ct3 = "Perscholas";
		System.out.println(ct1.compareTo(ct2));
		System.out.println(ct1.compareTo(ct3));
		System.out.println(ct3.compareTo(ct1));
	}

}
