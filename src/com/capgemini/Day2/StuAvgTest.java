package com.capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StuAvgTest {

	@Test
	void testcheckTotOfStu() {
		assertEquals(140,StuAvg.checkTotOfStu1(30,45,65));
		assertEquals(170,StuAvg.checkTotOfStu2(60,45,65));
		assertEquals(190,StuAvg.checkTotOfStu3(50,55,85));
		assertEquals(46.00,StuAvg.checkAvgOfStu1(30,45,65));
		assertEquals(56.00,StuAvg.checkAvgOfStu2(60,45,65));
		assertEquals(63,StuAvg.checkAvgOfStu3(50,55,85));
	}
		@Test
		
		void testTotAndAvgOnSubjects()
		{
			assertEquals(140,StuAvg.checkTotOfAllInSubject1(30,60,50));
			assertEquals(165,StuAvg.checkTotOfAllInSubject2(45,55,65));
			assertEquals(215,StuAvg.checkTotOfAllInSubject3(65,65,85));
			assertEquals(46.00,StuAvg.checkAvgOfAllInSubject1(30,60,50));
			assertEquals(55.00,StuAvg.checkAvgOfAllInSubject2(45,55,65));
			assertEquals(71.00,StuAvg.checkAvgOfAllInSubject3(65,65,85));
		}

	
	
	
	
	
	
	
	}


