package com.dhaya;

public class swapping_with_variable {
	public static void main(String[] args) {
		System.out.println("-------Before Swapping-------");
		int a=10;
		int b=20;
		System.out.println("The value of A is "+a);
		System.out.println("The value of B is "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("-------After Swapping-------");
		System.out.println("The value of A is "+a);
		System.out.println("The value of B is "+b);
	}

}
