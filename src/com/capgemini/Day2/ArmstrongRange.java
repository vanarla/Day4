package com.capgemini.Day2;

public class ArmstrongRange {

	public static int[] rangeOfArmstrong(int first,int last) {
		// TODO Auto-generated method stub
		int arrOfNumbers[]=new int[5];
		int digit;
		int sum;
		int num;
		int i=0;
		for(int k=first;k<=last;k++)
		{
			num=k;
		sum=0;
		while(num!=0)
		{
			digit=num%10;
			sum+=digit*digit*digit;
			num/=10;
		}
		if(sum==k)
		{
	 arrOfNumbers[i++]=k;
		}}
		return arrOfNumbers;
		}
	
	

}
