package com.capgemini.Day2;

public class Armstrong {

	public static boolean checkArmstrongNumber(int i) {
		 
		// TODO Auto-generated method stub
		
		int digit;
		int sum=0;
		int number=i;
		while(number!=0)
		{
			digit=number%10;
			sum=sum+digit*digit*digit;
			number/=10;
		}
		if(sum==i)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}	



