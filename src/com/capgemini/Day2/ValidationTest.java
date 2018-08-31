package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationTest {

	@Test
	void test() {
		assertEquals(1,Validation.checkId("Pallavi", "1200", "Pallavi", "1200"));
	}

}
