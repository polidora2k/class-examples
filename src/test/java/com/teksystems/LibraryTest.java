package com.teksystems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.teksystems.assigments.AdultUser;
import com.teksystems.assigments.KidUser;

public class LibraryTest {
	@Test
	public void test01() {
		KidUser kid = new KidUser();

		kid.setAge(10);
		assertEquals("You have successfully registered under a Kid's Account", kid.registerAccount());

		kid.setAge(18);
		assertEquals("Sorry age must be less than 12 to register as a kid", kid.registerAccount());

		kid.setBookType("Kids");
		assertEquals("Book issued successfully. Please return the book within 10 days", kid.requestBook());

		kid.setBookType("Fiction");
		assertEquals("Oops, you are allowed to take only kids books.", kid.requestBook());
	}

	@Test
	public void test02() {
		AdultUser adult = new AdultUser();

		adult.setAge(5);
		assertEquals("Sorry, age must be greater than 12 to register as an adult", adult.registerAccount());

		adult.setAge(23);
		assertEquals("You have successfully registered under an Adult Account", adult.registerAccount());

		adult.setBookType("Kids");
		assertEquals("Oops, you are allowed to take only adult Fiction books.", adult.requestBook());

		adult.setBookType("Fiction");
		assertEquals("Book issued successfully. Please return the book within 7 days", adult.requestBook());
	}
}
