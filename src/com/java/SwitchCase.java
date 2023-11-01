package com.java;
//javatpoint
//geeksforgeeks
public class SwitchCase {
	public static void main(String[] args) {
		int principalAmnt =10000;
		int amnt=2000;
		int process=1;

		switch(process) {
		case 1: 
			principalAmnt = principalAmnt+amnt;
			System.out.println("Available Balance : "+principalAmnt);
			break;
		case 2:
			principalAmnt=principalAmnt-amnt;
			System.out.println("Available Balance : "+principalAmnt);
			break;
		default:
			System.out.println("Try Somewhere Else...!!");
			break;
		}
	}
}
