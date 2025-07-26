package com.dhaya;
import java.util.*;
public class subarray_rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k, n);
            List<Integer> subList = Arrays.asList(Arrays.copyOfRange(arr, i, end));
            Collections.reverse(subList);
            for (int j = i; j < end; j++) {
                arr[j] = subList.get(j - i);
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
