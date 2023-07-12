package com.arjun;

import java.util.Arrays;

public class D {
    public static void main(String[] args) {
        int[] arr = {2,8,3,5,11};
        int temp = 0;

        for (int i = 0; i < arr.length/2 ; i++) {
//            [arr[i],arr[arr.length()-i-1]] = [arr.length()-1-i], arr[i]]
             temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
