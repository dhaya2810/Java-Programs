package com.dhaya;

import java.util.Scanner;

public class fact {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println(res);
	}
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==0) {
			return 0;
		}
		else {
			return n * fact(n-1);
		}
	}

}
