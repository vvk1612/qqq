package com.crm.java.program;

public class RevrseString {
	public static void main(String[] args) {
	String s="java";
	String rev="";
	char[]ch=s.toCharArray();
	int count=0;
	for(char c:ch) {
		count++;
	}
	for(int i=count-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev); 																																																																																	

}
}
