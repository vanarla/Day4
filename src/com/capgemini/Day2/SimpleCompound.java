package com.capgemini.Day2;


public class SimpleCompound {

	public static double calSimple(double principal, double time, double interest) {
		// TODO Auto-generated method stub
		double simple;
		
		simple=(principal*time*interest)/100;
	
		return simple;
	}

	public static double calCompound(double principal, double time, double interest) {
		// TODO Auto-generated method stub
		double compound;
		compound=principal*Math.pow(1.0+interest/100.0,time)-principal;
		
		return compound;
	}
	

}
