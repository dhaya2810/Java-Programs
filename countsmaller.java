package com.dhaya;

public class countsmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,1,2,3,0,11,4};
		int arr1[]=new int[arr.length];
		int j=0;
		while(j<arr.length) {
			int n=0;
			for(int i=j+1;i<arr.length;i++) {
				if(arr[j]>arr[i])
					n++;	
			}arr1[j]=n;
			j++;
			
		}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr1[i]+" ");
			}	
	}

}

