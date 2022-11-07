package com.teksystems.assigments;

public class AdultUser implements LibraryUser{
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
		if (age>=12) {
			System.out.println("You have successfully registered under an Adult Account");
			return "You have successfully registered under an Adult Account";
		} else {
			System.out.println("Sorry, age must be greater than 12 to register as an adult");
			return "Sorry, age must be greater than 12 to register as an adult";
		}
	}
	@Override
	public String requestBook() {
		if (bookType.equals("Fiction")) {
			System.out.println("Book issued successfully. Please return the book within 7 days");
			return "Book issued successfully. Please return the book within 7 days";
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
			return "Oops, you are allowed to take only adult Fiction books.";
		}
	}
}
