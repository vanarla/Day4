package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringRevTest {

	@Test
	void testrevLine() {
		assertEquals("ih olleh ",StringRev.revLine("hi hello"));
		}

}
