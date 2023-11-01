package com.java;
public class VariableScopes {
	static int x=100;
	public static void main(String[] args) {
		System.out.println("Global Variable x="+x);
		System.out.println("Global Variable x="+x);
		int x =10;
		System.out.println("local Variable x="+x);
		System.out.println("local Variable x="+x);
		System.out.println("local Variable x="+x);
		System.out.println("Global Variable x="+VariableScopes.x);
	}
}
