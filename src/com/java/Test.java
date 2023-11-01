package com.java;

public class Test {
	void A()
	{
		this.B();
		System.out.print("Hello..");
	}
	void B() {
		System.out.print("Hi..!");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.A();
		
	}
}
