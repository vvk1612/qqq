package com.crm.java.program;

public class ReverseEachWordGivenString {

	public static void main(String[] args) {
String s="welcome to Testyantra";
String[]str=s.split(" ");
String rev="";
for(int  i=str.length-1; i>=0; i--)

{
	rev=rev+str[i]+" ";
}
	

System.out.println(rev);
}}

