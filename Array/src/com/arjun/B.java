package com.arjun;

import java.util.ArrayList;
import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        int[] arr = {2,8,5,3,11};
        ArrayList<Integer> count = new ArrayList<>();
        int no = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length ; i++) {
            flag = false;
            for (int j = 2; j <arr[i] ; j++) {
                if (arr[i] % j == 0) {
                    flag = true;
                }
            } if(!flag){
                count.add(arr[i]);
                no++;
            }


        }
//        System.out.println(Arrays.toString(count));
        for (Integer i :count) System.out.print(i+ " ");
        System.out.println(" ");
        System.out.println(no);
    }
}
