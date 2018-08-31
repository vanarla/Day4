package com.capgemini.Day2;

public class Validation {

	public static int checkId(String userid, String password, String id, String pass) {
		// TODO Auto-generated method stub
		if(userid.equals(id) && pass.equals(password))
		{
			return 1;
			}
		else
		return 0;
	
	}

	
	
}
