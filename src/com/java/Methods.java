package com.java;

public class Methods {
	//Syntax:
//	Modifier returntype methodName(arguments) {
//		body of method
//  	return value
//	}
	//arguments-(datatype variableName)
	static int sum(int a, int b) {
		int total =a+b;
		return total;
	}
	static String season(String s){
		return s;
	}
	//s="summer";
	public static void main(String[] args) {
		
		int x=sum(10,20);
		System.out.println(x+10);
		int y =sum(100,200)+sum(9,9);
		System.out.println(y+8);
		System.out.println(sum(1,2));
		sum(1000,20);
		String s =season("Summer");
		System.out.println(s);
	}
}
