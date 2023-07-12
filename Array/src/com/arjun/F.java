package com.arjun;

public class F {
    public static void main(String[] args) {
        int n =5;
        int curr = 1;
        int prev = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(prev+ " ");
            int sum = curr + prev;
            prev = curr;
            curr = sum;

        }
    }
}
