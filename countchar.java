package com.dhaya;
import java.util.*;
public class countchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<=str.length();i++) {
			int count=1;
			char ch=str.charAt(i);
			if(str.indexOf(ch)!=i)
				continue;
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					
				}
			}System.out.print(str.charAt(i)+"="+count+" ");
			
		}
	}

}
