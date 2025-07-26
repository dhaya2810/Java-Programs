package com.dhaya;
import java.util.*;
public class min_of_2no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A value : ");
		int a=sc.nextInt();
		System.out.print("Enter B value : ");
		int b=sc.nextInt();
		System.out.println("Enter C value :");
		int c = sc.nextInt();

		if(a>b)
			System.out.println("The min of "+a+" and "+b+" is "+b);
		else
			System.out.println("Invalid");
	}

}

