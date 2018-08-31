package com.capgemini.Day2;

public class StringRev {

	public static Object revLine(String string) {
		// TODO Auto-generated method stub
		String words[]=string.split(" ");
		String revstring="";
		for(int i=0;i<words.length;i++)
		{
			String s="";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				s+=words[i].charAt(j);
			}
			revstring+=s+" ";
		}
		return revstring;
	}

}
