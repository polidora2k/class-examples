package com.teksystems.labs;

import java.util.ArrayList;

public class AddDataToArrayList {
	public ArrayList<Book> bookdetails() {
		// User-defined class objects in Java ArrayList

		ArrayList<Book> list = new ArrayList<Book>();
		// Passing data using Constructors
		Book b1 = new Book(1, "Death note", "John", "cartoon");
		Book b2 = new Book(2, "Stranger Things", "brothers", "suspense");
		Book b3 = new Book(3, "Spider man", "Alex", "Kids");
		Book b4 = new Book(4, "GentleMen", "Max", "Action");
		// Passing data using setter
		Book b5 = new Book();
		b5.setNumber(5);
		b5.setName("Java FullStack");
		b5.setAuthor("Flex");
		b5.setCategory("Programming");
		// Adding Books objects to Arraylist
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		return list;
	}

}
