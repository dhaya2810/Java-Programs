package com.dhaya;
import java.util.*;
public class hotel_mgmt_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the Room Type");
		System.out.println("1.Dulex \n2.Suite \n3.Standard");
		int a=sc.nextInt();
		int amt=3000;
		
		switch(a) {
		case 1  -> System.out.println("You have Choosen Dulex");
			
		case 2 ->
			System.out.println("You have Choosen Suite");
			
		case 3 ->
			System.out.println("You have Choosen Standard");
			
		
			
		}
		
		System.out.print("Total no of Guests : ");
		int gno=sc.nextInt();
		System.out.print("Enter a no of Night Stay : ");
		int day=sc.nextInt();
		int tamt=gno*day*amt;
		System.out.println("Total amount to pay : " + tamt);
	}
}

