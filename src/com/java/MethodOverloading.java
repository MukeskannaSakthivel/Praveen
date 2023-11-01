package com.java;
//Method Overloading
public class MethodOverloading {
	static  int sum(int a, int b) {
		int c =a+b;
		return c;
	}
	static  double sum(int a, double b) {
		double res =a*b;
		return res;
	}
	static  int sum(int a, int b, int c, int d) {
		int res =a+b+c+d;
		return res;
	}
	static boolean sum(int a, float b) {
		boolean c = false;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10,20.5));
	}
}
