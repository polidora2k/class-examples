package com.teksystems.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {
	public static void main(String[] args) throws IOException {

		try {
			String location = "/Users/ipolidora/Desktop/cars.csv";
			File file = new File(location);
			BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
			Scanner input = new Scanner(file);
			ArrayList<String[]> data = new ArrayList<String[]>();
			String in;
			while ((in = br.readLine()) != null) {
				String[] splitedLine = in.split(",");
				data.add(splitedLine);
			}
			for (String[] line : data) {
				System.out.println("Car Name: " + line[0]);
				System.out.println("MPG: " + line[1]);
				System.out.println("Cylinder: " + line[2]);
				System.out.println("Displacement: " + line[3]);
				System.out.println("Horsepower: " + line[4]);
				System.out.println("Weight: " + line[5]);
				System.out.println("Acceleration: " + line[6]);
				System.out.println("Model: " + line[7]);
				System.out.println("Origin: " + line[8]);
				System.out.println("===============================");
			}
			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found! ");
			e.printStackTrace();
		}
	}

}
