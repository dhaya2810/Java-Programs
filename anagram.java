package com.dhaya;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char str1[]=s1.toCharArray();
		char str2[]=s2.toCharArray();
		Arrays.sort(str1);
		System.out.println(str1);
		Arrays.sort(str2);System.out.println(str2);
		//int count
		boolean b=false;
				if(s1.length()!=s2.length()) {
					System.out.println(b);
				}else {
					for(int i=0;i<s1.length();i++) {
						for(int j=0;j<s2.length();j++) {
							if(str1[i]==str2[j]) {
								b=true;
								System.out.println(b);
								return;
							}
						}
					}
				}
	}
	}
