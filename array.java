package com.dhaya;

import java.util.Scanner;

public class array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int oc =0;
		int tc =0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				oc++;
			}
			else {
				tc++;
			}
		}
		System.out.println(oc);
		System.out.println(tc);
	}

}
