package com.arjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,11};
        Scanner a = new Scanner(System.in);

        System.out.println("Enter the 5 numbers");
        int[] ar =new int[5];
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = a.nextInt();
        }
        System.out.println("Array" + Arrays.toString(ar));

        for (int i = 0, j = ar.length-1; i< (j/2) ; i++,j--) {
                int temp = ar[j];
                ar[j] = ar[i];
                ar[i] = temp;
        }

        System.out.println(Arrays.toString(ar));

    }
}
