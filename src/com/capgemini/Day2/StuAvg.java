package com.capgemini.Day2;

import java.text.DecimalFormat;

public class StuAvg {

	public static int checkTotOfStu1(int subject1,int subject2,int subject3) 
	{
		return (subject1+subject2+subject3);
		
	}

	public static int checkTotOfStu2(int subject1, int subject2, int subject3) 
	{
		return (subject1+subject2+subject3);
		
	}

	public static int checkTotOfStu3(int subject1, int subject2, int subject3) 
	{
		return (subject1+subject2+subject3);
	}

	public static double checkAvgOfStu1(int subject1, int subject2, int subject3)
	{
		DecimalFormat df = new DecimalFormat("#.##");  
		double average;
		average=(subject1+subject2+subject3)/3;
		average= Double.valueOf(df.format(average));
		return average;
	}	
	public static double checkAvgOfStu2(int subject1, int subject2, int subject3)
	{
		DecimalFormat df = new DecimalFormat("#.##");  
		double average;
		average=(subject1+subject2+subject3)/3;
		average= Double.valueOf(df.format(average));
		return average;
	}	
	public static double checkAvgOfStu3(int subject1, int subject2, int subject3)
	{
		DecimalFormat df = new DecimalFormat("#.##");  
		double average;
		average=(subject1+subject2+subject3)/3;
		average= Double.valueOf(df.format(average));
		return average;
	}

	public static int checkTotOfAllInSubject1(int student1, int student2, int student3) 
	{
		return (student1+student2+student3);
		
	}
	public static int checkTotOfAllInSubject2(int student1, int student2, int student3) 
	{
		return (student1+student2+student3);
		
	}
	public static int checkTotOfAllInSubject3(int student1, int student2, int student3) 
	{
		return (student1+student2+student3);
		
	}

	public static double checkAvgOfAllInSubject1(int student1, int student2, int student3)
	{

		DecimalFormat df = new DecimalFormat("#.##");  
		double average;
		average=(student1+student2+student3)/3;
		average= Double.valueOf(df.format(average));
		return average;
		
	}	
	public static double checkAvgOfAllInSubject2(int student1, int student2, int student3)
	{

		DecimalFormat df = new DecimalFormat("#.##");  
		double average;
		average=(student1+student2+student3)/3;
		average= Double.valueOf(df.format(average));
		return average;
		
	}	
	public static double checkAvgOfAllInSubject3(int student1, int student2, int student3)
	{

		DecimalFormat df = new DecimalFormat("#.##");  
		double average;
		average=(student1+student2+student3)/3;
		average= Double.valueOf(df.format(average));
		return average;
	
	}
	
}
