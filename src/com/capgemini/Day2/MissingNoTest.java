package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingNoTest {

	@Test
	void test() {
		assertEquals(2, MissingNo.findMissingNo(new int[] {0,1,3,4,5},6));
	}

}
