package com.dhaya;
import java.util.*;
public class majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]= new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=sc.nextInt();
        }
        int repeatingCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(array[i]);
                break;
            }
        }
        
        }
	}



