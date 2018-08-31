package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicateTest {

	@Test
	void test() {
		assertEquals(" abc",Duplicate.findDuplicates("abbc"));
		assertEquals(" abc",Duplicate.findDuplicates("aabccc"));
		
	}

}
