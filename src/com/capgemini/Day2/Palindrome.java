package com.capgemini.Day2;

public class Palindrome {

	public static boolean checkPalindrome(int number) {
		// TODO Auto-generated method stub
		int rem;
		int res=0;
		int m=number;
		while(number>0)
		{
			rem=number%10;
			res=res*10+rem;
			number=number/10;
		}
        if(res==m)
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}

}
