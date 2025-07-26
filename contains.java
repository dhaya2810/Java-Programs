package com.dhaya;
import java.util.*;
public class contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		
		String str = sc.nextLine();
		String c=sc.next();
		if(str.contains(c)) {
			System.out.println("YES");
		}else {
			System.out.println("NOO");
			System.out.print(str);
		}
	}   

}
