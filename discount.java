package com.dhaya;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {500,450,0,600};
		for (int i=0;i<4;i++) {
			System.out.println("Original Price - "+a[i]);
			if(a[i]>=500) {
				a[i]=a[i]-(a[i]/100*10);
			}
			System.out.println("After Discout - "+a[i]);
		}

	}

}
