package com.dhaya;
import java.util.*;
public class loyal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int salary = scanner.nextInt();
		if (age >=18) {
			if (salary >=10000) {
				System.out.println("Eligible");
			}
			else {
				System.out.println("Not Eligible");
			}
		}
	}

}
