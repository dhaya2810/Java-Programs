package com.dhaya;
import java.util.*;
import java.util.Arrays;

public class maximum_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int product=1;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int i=arr.length/2;
		for(int j=i;j<arr.length;j++) {
		product=product*arr[j];
		}
		System.out.println(product);
		
		
	//Third Largest element
		System.out.println("The third large element is : "+arr[size-3]);

	}

}

