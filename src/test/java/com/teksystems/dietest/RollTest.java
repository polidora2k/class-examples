package com.teksystems.dietest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.teksystems.examples.Die;

class RollTest {
	private void test(Integer numberOfFaces) {
		Integer unexpected = null;
		Die die = new Die(numberOfFaces);
		
		die.roll();
		Integer actual = die.getCurrentFaceValue();
		Assertions.assertNotEquals(unexpected, actual);
	}
	
	@Test
	void test0() {
		test(2);
	}
	
	@Test
	void test1() {
		test(3);
	}
	
	@Test
	void test2() {
		test(null);
	}

}
