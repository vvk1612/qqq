package com.crm.java.program;

import java.util.LinkedHashSet;

public class PrintUniqueWordInString {

	public static void main(String[] args) {
String s="welcome to welcome to testyantra";
String[] str=s.split(" ");

LinkedHashSet<String>set=new LinkedHashSet<String>();

for(int i=0; i<str.length; i++) {
	set.add(str[i]);
}

for(String st:set) {
	int count=0;
	for(int i=0; i<str.length; i++) {
		if(st.equals(str[i])) {
			count++;
		}
	}
if(count==1) {
	System.out.println(st+" ");
}
}
	}

}
