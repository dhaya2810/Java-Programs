package com.dhaya;

public class longestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming hello";
		String[] st1=str.split(" ");
		String emp="";
		for(int i=0;i<st1.length;i++) {
			if(st1[i].length()>emp.length()) {
				emp=st1[i];
			}
		}System.out.println(emp);
	}

}
