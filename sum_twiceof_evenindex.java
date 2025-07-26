package com.dhaya;
import java.util.*;
public class sum_twiceof_evenindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}int k=sc.nextInt();
		int sum=0;
		for(int i=0;i<a;i+=2) {
			if(arr[i] > 2*k) {
				sum+=arr[i];
			}
		}System.out.println(sum);
	}

}
