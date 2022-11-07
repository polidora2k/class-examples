package com.teksystems.assigments;

public class KidUser implements LibraryUser{
	private int age;
	private String bookType;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	@Override
	public String registerAccount() {
		if (age<12) {
			System.out.println("You have successfully registered under a Kid's Account");
			return "You have successfully registered under a Kid's Account";
		} else {
			System.out.println("Sorry age must be less than 12 to register as a kid");
			return "Sorry age must be less than 12 to register as a kid";
		}
		
	}
	@Override
	public String requestBook() {
		if (bookType.equals("Kids")) {
			System.out.println("Book issued successfully. Please return the book within 10 days");
			return "Book issued successfully. Please return the book within 10 days";
		} else {
			System.out.println("Oops, you are allowed to take only kids books.");
			return "Oops, you are allowed to take only kids books.";
		}
	}
}
