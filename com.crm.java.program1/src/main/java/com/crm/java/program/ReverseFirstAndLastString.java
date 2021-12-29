package com.crm.java.program;

public class ReverseFirstAndLastString {

	public static void main(String[] args) {
String s="Welcome to test organisation";
	String[] str=s.split(" ");
	String temp=str[0];
	str[0]=str[str.length-1];
	str[str.length-1]=temp;
	
	for(int i=0; i<str.length-1; i++)
	{System.out.print(str[i]+" ");
	}
	}
}
