package com.dhaya;
import java.util.*;
public class matrix_transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]=new int[a][b];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			arr[i][j]=sc.nextInt();
		}
			
	}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}System.out.println();
		}

}
}

