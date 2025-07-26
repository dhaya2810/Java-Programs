package com.dhaya;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String a = sc.nextLine();
		String rev="";
		if(isPalindrome(a,rev)) {
			System.out.println("The value is Palindrome...");
		}else {
			System.out.println("The value is Not Palindrome...");
		}
		sc.close();
	}
	public static boolean isPalindrome(String a,String rev) {
		a=a.toLowerCase();
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}System.out.println("The reversed String is : "+rev);
		if(a.equals(rev)) {
			return true;
		}
		return false;
			
		
	}

}
