package com.dhaya;
import java.util.*;
public class cr7no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int size =String.valueOf(a).length();
		int firstdigit=a/(int)Math.pow(10, size-1);
		int lastdigit=a%10;
		int sum=firstdigit+lastdigit;
		if(sum==7)
			System.out.println(a+" is a CR7 Number");
		else
			System.out.println(a+" Not a CR7 Number");
	}

}
