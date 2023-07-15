package com.arjun;

public class L {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 9, 10, 8, 7};
        int sum = 0;

        int total = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i <3) {
                int j = arr[arr.length - i - 1];
                sum += j;
            }
        }
        total = arr[0] - sum;
        System.out.println(total);
    }
}
