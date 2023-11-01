package com.java;

public class OddorEven {
	public static void main(String[] args) {
		//Even Number all numbers Divided by 2:
		//num/2 remainder-0;
		//   ---/ division --> quotient
		// Modulus --> remainder "%"
		System.out.println(16/2);
		System.out.println(16%2);
		//%2==0--->Even Number else:-->odd number
		int num=14;
		if(num%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		//Ternary operator
		String res = (num%2==0)?"Even":"Odd";
		System.out.println(res);
	}
}
