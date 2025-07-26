package com.dhaya;
import java.util.*;
public class maxof2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr1[]=new int[a];
		int arr2[]=new int[a];
		for(int i=0;i<a;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			arr2[i]=sc.nextInt();
		}
		int max1=0;
		for(int i=0;i<a;i++) {
			if(arr1[i]>max1) {
				max1=arr1[i];
			}
			
		}
		int max2=0;
		for(int i=0;i<a;i++) {
			if(arr2[i]>max1) {
				max2=arr2[i];
			}
	}
		System.out.println(Math.max(max1, max2));

}
}
