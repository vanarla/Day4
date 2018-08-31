package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCompoundTest {

	@Test
	void testcalSimplecalCompound() {
		assertEquals(10.0,SimpleCompound.calSimple(100,5,2),0.02);
		assertEquals(10.40,SimpleCompound.calCompound(100,5,2),0.4080803199999);
		assertEquals(-0.0,SimpleCompound.calSimple(-100,0,1),0.02);
		assertEquals(0.0,SimpleCompound.calCompound(-100,0,1),0.2);
		assertEquals(10.0,SimpleCompound.calSimple(100,5,2),0.02);
		assertEquals(10.40,SimpleCompound.calCompound(100,5,2),0.4080803199999);
	}

}
