package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistValTest {

	@Test
	void test() {
		assertEquals(true,DistVal.CheckDifference(new int[] {3,2,4,5,6,2},5));
	}

}
