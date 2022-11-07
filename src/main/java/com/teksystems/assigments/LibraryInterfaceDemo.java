package com.teksystems.assigments;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser kid = new KidUser();
		
		kid.setAge(10);
		kid.registerAccount();
		
		kid.setAge(18);
		kid.registerAccount();
		
		kid.setBookType("Kids");
		kid.requestBook();
		
		kid.setBookType("Fiction");
		kid.requestBook();
		
		AdultUser adult = new AdultUser();
		
		adult.setAge(5);
		adult.registerAccount();
		
		adult.setAge(23);
		adult.registerAccount();
		
		adult.setBookType("Kids");
		adult.requestBook();
		
		adult.setBookType("Fiction");
		adult.requestBook();
	}

}
