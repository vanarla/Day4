package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountTest {

	@Test
	void test() {
		assertEquals(65,Discount.calDis(100));
		assertEquals(0,Discount.calDis(0));
	}

}
