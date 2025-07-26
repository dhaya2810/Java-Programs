package com.dhaya;
import java.util.*;
public class palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.next();
		//str=str.toLowerCase();
		String revstr="";
		for(int i=str.length()-1;i>=0;i--) {
			revstr+=str.charAt(i);
		}System.out.println("The reversed string is: "+revstr);
		if(str.equals(revstr))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
