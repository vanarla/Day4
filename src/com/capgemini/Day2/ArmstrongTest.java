package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void testcheckArmstrongNumber() {
		assertEquals(true,Armstrong.checkArmstrongNumber(153));
		assertEquals(true,Armstrong.checkArmstrongNumber(-153));
		assertEquals(false,Armstrong.checkArmstrongNumber(0653));
		assertEquals(false,Armstrong.checkArmstrongNumber(0x56));
		assertEquals(false,Armstrong.checkArmstrongNumber(100));
		assertEquals(false,Armstrong.checkArmstrongNumber('b'));
	}

}
