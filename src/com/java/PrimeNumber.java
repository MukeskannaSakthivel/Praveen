package com.java;

public class PrimeNumber {
	public static void main(String[] args) {
		//loop
		//forLoop
		
		int n=24;
		int count=0;
		//17%1,17%2,17%3,17%4,17%5........,17%17
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}//end of for loop
		//check the count value 
		System.out.println(count);//24-8-->1,2,3,4,6,8,12,24
		if(count<=2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}

}
