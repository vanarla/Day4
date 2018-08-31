package com.capgemini.Day2;

public class Duplicate {

	public static Object findDuplicates(String word) {
		// TODO Auto-generated method stub
		int len=word.length();
		char ch;
		String res=" ";
		for(int i=0;i<len;i++)
		{
			ch=word.charAt(i);
			if(ch!=' ')
			{
				res=res+ch;
				word=word.replace(ch,' ');
			}
			
		}
		return res;
	}

}
