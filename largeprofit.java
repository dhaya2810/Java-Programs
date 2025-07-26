package com.dhaya;
import java.util.*;
public class largeprofit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int min=0;
		int max=0;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[size];
		min=Arrays.stream(arr).min().getAsInt();
		for(int i=min;i<size;i++) {
			arr1[i]=Math.abs(min-arr[i]);
		}max=Arrays.stream(arr1).max().getAsInt();
		System.out.println(max);
	}

}
