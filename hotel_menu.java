package com.dhaya;
import java.util.*;
public class hotel_menu {
	public static void main(String args[]) {
		System.out.println("WELCOME TO A1 MESS");
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER THE SESSION :");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			System.out.println("****MORNING****");
			System.out.println("1.IDLY \n 2.DOSAI \n 3.PONGAL \n 4.VADAI");
			break;
		case 2:
			System.out.println("****LUNCH****");
			System.out.println("1.CHICKEN BRIYANI \n 2.MUTTON BIRIYANI \n 3.CHILLY CHICKEN");
			break;
		case 3:
			System.out.println("****NIGHT****");
			System.out.println("1.FRIED RICE \n 2.CHILLY PORATTO \n 3.NOODLES");
			break;
		case 4:
			System.out.println("Desire Prices👇");
			System.out.println("ITEM     QUANTITY     RATE");
			System.out.println("IDLY        2         Rs.12\nDOSA        2         Rs.30\nPONGAL+\nVADAI        1         Rs.40\n");
				
			
		}
		
	}

}
