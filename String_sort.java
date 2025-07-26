package com.dhaya;
import java.util.*;
public class String_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		String str[]=new String[a];
		for(int i=0;i<a;i++) {
			str[i]=sc.nextLine();
			str[i].toLowerCase();
		}
		Arrays.sort(str);
		for(String g:str) {
			System.out.println(g);
		}
	}

}
