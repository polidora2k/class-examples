package com.teksystems.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Examples8 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = null;
//		FileReader in = null;
//		FileWriter out = null;
//		try {
//			// change below file path as per your file path
//			in = new FileReader(
//					"/Users/ipolidora/Development/workspace-spring-tool-suite-4-4.16.0.RELEASE/class-examples/src/main/resources/testingFile.txt");
//			br = new BufferedReader(in);
//			out = new FileWriter("sampleOutput3.txt");
//			String c;
//
//			while ((c = br.readLine()) != null) {
//				out.write(c); // writing data in file
//			}
//			System.out.println("Reading and Writing in a file is done!!!");
//		} catch (Exception e) {
//			System.out.println(e);
//		} finally {
//			if (in != null) {
//				in.close();
//			}
//			if (out != null) {
//				out.close();
//			}
//		}
		ascii();
	}

	public static void ascii() throws IOException {
		String inputFiles = "/Users/ipolidora/Downloads/file1.txt";
		char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	    char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		BufferedReader br = new BufferedReader(new FileReader(inputFiles));
		int c;
		while ((c = br.read()) != -1) {
			if (c == 32) {
				System.out.print(" ");
			} else if (c == 10){
				System.out.println();
			} else if ((c > 90 || c < 65) && (c > 122 || c < 97)){
				continue;
			} else if (c <= 90 && c >= 65) {
				c -= 65;
				System.out.print(upper[c]);
			} else {
				c -= 97;
				System.out.print(lower[c]);
			}
		}
		
		br.close();
	}

}
