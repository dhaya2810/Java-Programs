package com.dhaya;
import java.util.*;
public class string_basics {
	static void Solution(String st,int age) {
		System.out.println(st+":"+age);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int age=sc.nextInt();
		Solution(str,age);
	}
}
