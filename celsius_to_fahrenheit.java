package com.dhaya;
import java.util.*;
public class celsius_to_fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Celsius : ");
		float celsius = sc.nextFloat();
		float fahrenheit = (celsius*9/5)+32;
		System.out.print("The fahrenheit value is :"+fahrenheit);

	}

}
