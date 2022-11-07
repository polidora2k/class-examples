package com.teksystems.dietest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.teksystems.examples.Die;

class ConstuctorTest {

	private void test(Integer expectedNumberOfFaces) {
		Integer expectedFaceValue = null;
		
		Die die = new Die(expectedNumberOfFaces);
		Integer actualFaceValue = die.getCurrentFaceValue();
		Integer actualNumberOfFaces = die.getNumberOfFaces();
		
		Assertions.assertEquals(expectedFaceValue, actualFaceValue);
		Assertions.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
	}
	
	@Test
	void test0() {
		test(3);
	}
	
	@Test
	void test1() {
		test(4);
	}
	@Test
	void test2() {
		test(6);
	}

}
