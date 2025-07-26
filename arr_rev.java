package com.dhaya;
import java.util.*;
public class arr_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Integer arr[]=new Integer[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));

	}

}
