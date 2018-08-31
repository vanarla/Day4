package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testcheckPalindrome() {
		assertEquals(true,Palindrome.checkPalindrome(121));
		assertEquals(false,Palindrome.checkPalindrome(100));
		assertEquals(false,Palindrome.checkPalindrome(-121));
		
	}

}
