package com.dhaya;
import java.util.*;
public class toggle_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>='A'&&c[i]<='Z') {
				c[i]= (char)(c[i]+32);
			}else if(c[i]>='a'&&c[i]<='z') {
				c[i]=(char)(c[i]-32);
			}System.out.print(c[i]);
		}
	}

}
