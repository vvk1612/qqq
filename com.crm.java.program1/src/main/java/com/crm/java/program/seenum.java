package com.crm.java.program;

public class seenum {

	public static void main(String[] args) {
		String s="a12$3";
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
             int n=s.charAt(i)-48;
             sum=sum+n;
	}
		System.out.println(sum);
		}
	}

}
