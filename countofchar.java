package com.dhaya;
import java.util.*;
public class countofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next();
		String str1= "";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
			
		}
		System.out.println("The reversed string is : "+ str1);
		}
		
		
		

	}


