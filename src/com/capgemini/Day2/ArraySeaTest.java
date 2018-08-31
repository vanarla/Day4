package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraySeaTest {

	@Test
	void test() {
		assertEquals(true,ArraySea.searchElement(new int[] {1,2,3,4,5,6,7},4));
	}

}
