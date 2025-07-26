package com.dhaya;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		rev(a);
	}
	static void rev(int a) {
		if(a>0) {
			System.out.print(a%10);
			 rev(a/10);
		}
		
	}
	

}
