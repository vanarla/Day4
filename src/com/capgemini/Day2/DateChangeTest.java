package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateChangeTest {

	@Test
	void test() {
		assertEquals("28/May/1995",DateChange.changeDate(28,05,1995));
		assertEquals("5/June/2019",DateChange.changeDate(5,06,2019));
	}

}
