package com.dhaya;

import java.util.Arrays;

public class stock_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,10,1,3,6,9,2};
		int min=Arrays.stream(arr).min().getAsInt();
		int[] arr1=new int[10];
		int maxdiff=0;
		for(int i=min+1;i<=arr.length-1;i++) {
			arr1[i]=Math.abs(min-arr[i]);
			maxdiff=Arrays.stream(arr1).max().getAsInt();
			}System.out.println(maxdiff);
	}

}
