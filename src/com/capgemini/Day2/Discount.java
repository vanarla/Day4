package com.capgemini.Day2;

public class Discount {

	public static int calDis(int newItem) {
		// TODO Auto-generated method stub
		
		int discount;
		int newItemPrice;
		discount=newItem*35/100;
		newItemPrice=newItem-discount;
		return newItemPrice;
	}

}
