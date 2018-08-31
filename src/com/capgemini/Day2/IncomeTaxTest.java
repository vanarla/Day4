package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncomeTaxTest {

	@Test
	void test() {
		assertEquals(22000, IncomeTax.calIncome(350000),0.2);
	}

}
