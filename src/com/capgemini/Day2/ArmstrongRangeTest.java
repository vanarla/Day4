package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongRangeTest {

	@Test
	void testrangeOfArmstrong() {
		assertArrayEquals(new int[] {153,370,371,407,0},ArmstrongRange.rangeOfArmstrong(100,1000));
		assertArrayEquals(new int[] {153,370,371,407,0},ArmstrongRange.rangeOfArmstrong(10,1000));
		
	}

}
