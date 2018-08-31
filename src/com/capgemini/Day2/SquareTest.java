package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		assertEquals(25,Square.findSquare(5));
		assertEquals(25,Square.findSquare(-5));
		
	}

}
