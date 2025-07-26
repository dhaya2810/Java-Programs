package com.dhaya;
import java.util.*;
public class dev {
	public static void main(String[]args) {
	int n=1234;
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	while(n>0) {
		int a=n%10;
		if(a>max) {
			max=a;
		}
		else if(a<min) {
			min=a;
		}
		n=n/10;
	}
	System.out.println("min="+min);
	System.out.println("max="+max);
 }
}
