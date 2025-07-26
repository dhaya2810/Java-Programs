package com.dhaya;

import java.util.Arrays;

public class subarrayproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,25,5,8,7,6,27};
		int product=1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length/2;i++) {
			product=product*arr[i];
		}System.out.println(product);
	}

}
