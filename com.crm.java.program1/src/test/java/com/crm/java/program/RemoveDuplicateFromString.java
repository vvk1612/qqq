package com.crm.java.program;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
String s="testyantra";

LinkedHashSet<Character>set=new LinkedHashSet<Character>();

for(int i=0;i<s.length();i++)
{set.add(s.charAt(i));
	}
for(char ch:set) {
	System.out.print(ch);
}
	}
}
