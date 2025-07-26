package com.dhaya;

public class main {
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	int add(int ... value) {
		int total=0;
		for(int i:value) {
			total=total+i;
		}return total;
	}
	public class sain{
		public static void main(String args[]) {
			main obj1=new main();
			System.out.println(obj1.add(5,6));
			System.out.println(obj1.add(1,2,3,4,5,6,7,8,9));
			System.out.println(obj1.add(124564, 546654));
			System.out.println(obj1.add(1, 5, 7));
		}
	}
}
