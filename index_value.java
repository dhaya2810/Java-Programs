package com.dhaya;
import java.util.*;
class index_value {
	static int index(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			if(arr[i]==i)
				return arr[i];
		}
		return size;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}int result=index(arr,size);
		System.out.println(result);
	}
}
