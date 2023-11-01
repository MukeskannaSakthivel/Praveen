package com.java;

public class Sample {
	public static void main(String[] args) {
	//a,b,c
		//a--> b,c
		//b-->a,c
		//c-->a,b
		int a=77;int b=25;int c=122;
		if(a>b) {//a
			if(a>c) {//if true a: false c
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else if(b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
			
		
	}
}
