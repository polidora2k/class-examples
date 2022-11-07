package com.teksystems.testThisTest;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.teksystems.examples.TestThis;

class GetNameTest {
	private void test(Integer index, String expected) {
		TestThis tt = new TestThis();
		String actual = tt.getNameAtIndex(index);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void test0() {
		test(2, "Tony");
	}
	
	@Test
	void test1() {
		test(0, "Mike");
	}

}
