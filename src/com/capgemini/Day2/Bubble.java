package com.capgemini.Day2;

public class Bubble {

	public static int[] sortList(int[] num) {
		
		
		for(int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++)
			{
				if(num[i]>num[j])
				{
					int tp = num[i];
					num[i]=num[j];
					num[j]=tp;
				}
			}
		}
		for(int i=0;i<=14;i++)
		{
			System.out.println(num[i]+" ");
		}
		return num;
	}

}
