package com.capgemini.Day2;

public class Results {

		

		public static String calResult(int m1, int m2, int m3) {
			// TODO Auto-generated method stub
			if(m1 > 60 && m2 > 60 && m3 > 60)
			{
				return "Passed";
			}
			else if(m1>60 && m2>60 || m2>60 && m3>60 || m3>60 && m1>60)
			{ 
				return "Promoted";
			}
			else 
			{
				return "Failed";
			}
		}
}