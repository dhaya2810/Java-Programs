package com.dhaya;
import java.util.*;
public class dev2 {
	public static void main(String[]args) {
		int n=1231;
		String s=Integer.toString(n);
		int l=s.length();
		int fh=0,sh=0;
		for(int i=0;i<l;i++) {
			if(i<l/2) {
				fh+=Character.getNumericValue(s.charAt(i));
			}
			else {
				sh+=Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println(fh==sh?"valid":"not valid");
	}
}
