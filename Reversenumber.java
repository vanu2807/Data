package com.prg.org;

public class Reversenumber {
public static void main(String[] args) {
	int a = 45678;
	int reverse = 0;
	while(a != 0) {
		int reminder= a% 10; //reminder in division
		reverse = reverse* 10+ reminder;
		a= a/10; // quotient
	}
	System.out.println("The reverse of the given number is :" +reverse);
}
}
