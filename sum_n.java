package com.dhaya;
import java.util.*;
public class sum_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=sumn(n);
		System.out.println(res);
	}
	static int sumn(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==0) {
			return 0;
		}
		else {
			return n + sumn(n-1);
		}
	}

}
