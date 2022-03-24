package com.prg.org;

public class ReverseString {
public static void main(String[] args) {
	String str = "Vaanmathi";
	String ref = "";
	int Length= str.length();
	System.out.println(Length);
	
	for (int i=Length-1;i>=0;i--) {
		ref = ref+str.charAt(i);
	}
	System.out.println(ref);
}
}
