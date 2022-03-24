package com.prg.org;

public class Swappingnumbers {
 public static void usingthirdvariable() {
	 int a=10;
	 int b=30;
	 System.out.println("Before swapping: "+"a = "+a +"b = "+b);
	 int c =a; //c= 10
	 a =b; //a=30
	 b=c; //b=10
	 System.out.println("After swapping: "+"a = "+a +"b ="+b);
 }
 public static void withoutusingthirdvarible() {
	 int a=10;
	 int b=30;
	 System.out.println("Before swapping: "+"a ="+a +"b ="+b);
	 a= a-b; //10-30= -20
	 b= a+b; //-20+30= 10
	 a= b-a; //10-(-20) =30
	 System.out.println("After swapping: "+"a ="+a +"b ="+b);
 }
 public static void main(String[] args) {
	Swappingnumbers obj= new Swappingnumbers();
	obj.usingthirdvariable();
	obj.withoutusingthirdvarible();
}
}