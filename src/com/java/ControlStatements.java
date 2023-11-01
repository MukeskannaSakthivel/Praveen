package com.java;

public class ControlStatements {
	public static void main(String[] args) {
		// Swap two Numbers
		int a =10;
		int b= 20;
		System.out.println("Before Swapping");
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		System.out.println("***************************************************");
		System.out.println("After Swapping");
		//Using c isTemporary Variable
		/*int c =0;
		c=a;
		a=b;
		b=c;
		System.out.println("A is "+a);
		System.out.println("B is "+b);*/
		System.out.println("***************************************************");
		//Without Temporary Variable
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("A is "+a);
		System.out.println("B is "+b);
	}
}
