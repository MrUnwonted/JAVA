package com.arjun;

public class I {
    public static void main(String[] args) {
        int[] arr = {3,5,6,2,4,9,1,8,7};
        int count =  0;

        for (int i = 0; i <arr.length-1 ; i++) {
            if (count<2){
                System.out.println(arr[i]);
            }
            count++;
            if (count == 5){
                count = 0;
            }
        }

    }
}
