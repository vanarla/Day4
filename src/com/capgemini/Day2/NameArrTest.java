package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameArrTest {

	@Test
	void test() {
	assertEquals(true,NameArr.findName(new String[] {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","Kity","Meery","Smith","Johnson","Bill","Williams",
			"Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"},"Dave"));

}
}