package com.dhaya;
import java.util.*;
public class mal_table {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a Value : ");
    	int a = sc.nextInt();
        for (int i = 1; i <= a;i++) {
            for (int j = 1; j <=i;j++) {
            	System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
