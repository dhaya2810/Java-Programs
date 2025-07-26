package com.dhaya;
import java.util.*;
public class swapping_without_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.print("Enter the value of A : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of B : ");
		int b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("After Swappping");
		System.out.println("The value of A is : "  + a);
		System.out.println("The value of B is : " +b);
	}

}
