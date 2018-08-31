package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResultsTest {

	@Test
	void test() {
		assertEquals("Passed",Results.calResult(70,70,70));
		assertEquals("Promoted",Results.calResult(50,70,70));
		assertEquals("Failed",Results.calResult(50,50,50));
	}

}
