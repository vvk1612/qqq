package com.crm.java.program;

import java.util.LinkedHashSet;

public class ReverseWordsInString {

	public static void main(String[] args) {
String s="testyantra is a it organisation";
String[]str=s.split(" ");
LinkedHashSet<String>set=new LinkedHashSet<String>();
for(int i=0; i<str.length; i++) {
	set.add(str[i]);
}
for(String st:set) {
	char[] ch=st.toCharArray();
	for(int i=st.length()-1; i<st.length(); i--) {
		System.out.print(ch[i]+" ");
	}
}
	}

}
