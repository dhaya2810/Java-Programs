package com.dhaya;
import java.util.*;
public class array_creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int a = sc.nextInt();
		int[] dhaya = new int[a];
		System.out.print("Enter the array values : ");
		for(int i=0;i<a;i++) {
			dhaya[i] = sc.nextInt();
		}
		System.out.print("The array will be :");
		for(int i=0;i<dhaya.length;i++) {
			System.out.print(" "+dhaya[i]);
		}
	}

}
