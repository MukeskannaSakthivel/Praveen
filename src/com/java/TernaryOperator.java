package com.java;

public class TernaryOperator {
	//Ternary Operator:
	//Syntax
	//(Condition)?true:false;
	
	public static void main(String[] args) {
		int a=40;int b=20;
		 int res = (a>b)?a:b;
		 String r1 =(a>b)?"a is greater"+a:"b is greater "+b;
		 char r2 =(a>b)?'a':'b';
		 System.out.println((a>b)?"a is greater"+a:"b is greater "+b);
		 System.out.println(r1);
		 System.out.println(r2);
		 if(a>b) {
			 System.out.println("a i greater"+a);
		 }
		 else
		 {
			 System.out.println("b is greater "+b);
		 }
	}
}
