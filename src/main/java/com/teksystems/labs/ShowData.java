package com.teksystems.labs;

import java.util.ArrayList;

public class ShowData {
	public static void main(String[] args) {
		// instantioation to class AddDataToArrayList
		AddDataToArrayList b = new AddDataToArrayList();
		ArrayList<Book> mybooklist = b.bookdetails();
		for (Book showValue : mybooklist) {
			// ---- invoking getter method for geting Data---------
			System.out.println(showValue.getNumber() + " " + showValue.getName1() + " " + showValue.getCategory() + " "
					+ showValue.getAuthor());
		}
	}
}