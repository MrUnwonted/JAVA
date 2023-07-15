package com.arjun;

import java.util.*;

public class H {
    public static void main(String[] args) {
        int[] arr = {7,5,2,6,9,4,2};
        for (int i = 0; i < arr.length-1; i++) {
            int count =0;
            for (int k : arr) {
                if (arr[i] == k && i!=k) {
                    count++;
                }
            }
            if (count!=0){
                System.out.println(arr[i]);
        }

        }
    }
}
